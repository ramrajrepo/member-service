package com.business.memberservice.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.business.memberservice.contsant.Constants;
import com.business.memberservice.model.Member;
import com.business.memberservice.service.MemberService;
import com.business.memberservice.vo.MemberResponseVo;
import com.business.memberservice.vo.MemberVo;

@RestController
@RequestMapping(value = "/members", produces = "application/hal+json")
public class MemberShipController {
	Logger logger = LoggerFactory.getLogger(MemberShipController.class);

	@Autowired
	private MemberResponseVo memberResponseVo;
	@Autowired
	private Optional<Member> member;
	@Autowired
	private MemberService service;
	@Autowired
	private ModelMapper modelMapper;

	@PostMapping
	public ResponseEntity<MemberResponseVo> save(@Valid @RequestBody MemberVo memberVo) {
		logger.info("Started saving entity!" + memberVo.toString());
		member = service.save(modelMapper.map(memberVo, Member.class));
		if (member.isPresent()) {
			memberResponseVo.setMember(modelMapper.map(member.get(), MemberVo.class), Constants.CREATED,
					Constants.CREATED_NAME, "Mmber created successfully!!");
			logger.info("Member creted successfully " + memberResponseVo.toString());
		} else {
			memberResponseVo.setResponse(Constants.NO_CONTENT, Constants.NOT_CREATED_NAME,
					"Mmber not created internal server error!!");
			logger.error("Member not creted!!");
		}
		// memberResponseVo.getMember().add(linkTo(MemberShipController.class).slash(memberResponseVo.getMember().getId()).withSelfRel());
		// memberResponseVo.getMember().add(linkTo(MemberShipController.class).slash(memberResponseVo.getMember().getId()).withRel("member"));
		return new ResponseEntity<MemberResponseVo>(memberResponseVo, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> saveOrUpdate(@Valid @RequestBody MemberVo memberVo, @PathVariable final Long id) {
		logger.info("Started updating entity!" + memberVo.toString());
		if (service.existsById(id)) {
			memberVo.setId(id);
			member = service.save(modelMapper.map(memberVo, Member.class));
			memberResponseVo.setMember(modelMapper.map(member.get(), MemberVo.class), Constants.ACCEPTED,
					Constants.ACCEPTED_NAME, "Mmber updated successfully!!");
			logger.info("Member updated successfully " + memberResponseVo.toString());
		} else {
			logger.error("Member not updated " + memberResponseVo.toString());
			throw new ResourceNotFoundException("Mmber not found!!");
		}
		return new ResponseEntity<>(memberResponseVo, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable final Long id) {
		logger.info("Started seraching for id " + id);
		Optional<Member> member = service.findById(id);
		if (member.isPresent()) {
			memberResponseVo.setMember(modelMapper.map(member.get(), MemberVo.class), Constants.FOUND,
					Constants.FOUND_NAME, "Mmber found successfully!!");
			logger.info("Member found successfully " + memberResponseVo.getMember().toString());
		} else {
			logger.error("Member not exist! " + memberResponseVo.getMember().toString());
			throw new ResourceNotFoundException("Mmber not found!!");
		}

		return new ResponseEntity<>(memberResponseVo, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<?> findAll(@RequestParam(defaultValue = "0") Integer pageNo,
			@RequestParam(defaultValue = "20") Integer pageSize, @RequestParam(defaultValue = "id") String sortBy) {
		logger.info("Started seraching for members! ");
		List<Member> members = service.findAll(pageNo, pageSize, sortBy);
		if (members.isEmpty()) {
			throw new ResourceNotFoundException("No ember exist!!");
		}
		return new ResponseEntity<>(members, HttpStatus.FOUND);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteById(@PathVariable final Long id) {
		if (service.existsById(id)) {
			service.deleteById(id);
			memberResponseVo.setResponse(Constants.ACCEPTED, Constants.ACCEPTED_NAME, "Member deleted successfully!!");
		} else {
			throw new ResourceNotFoundException("Member not exist!!");
		}

		return new ResponseEntity<>(memberResponseVo, HttpStatus.OK);
	}

}
