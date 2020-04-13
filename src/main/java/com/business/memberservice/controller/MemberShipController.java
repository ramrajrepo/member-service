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
import com.business.memberservice.vo.MemberRequestVo;
import com.business.memberservice.vo.MemberResponseVo;
import com.business.memberservice.vo.MemberVo;

@RestController
@RequestMapping("/members")
public class MemberShipController {
	Logger logger = LoggerFactory.getLogger(MemberShipController.class);
	@Autowired(required=true)
	private MemberService service;
	@Autowired
	private MemberVo memberVo;
	@Autowired
	private MemberResponseVo memberResponseVo;
	@Autowired(required=false)
	private Member member;
    @Autowired
	private ModelMapper modelMapper;
	
	
	@PostMapping
	public ResponseEntity<MemberResponseVo> save(@Valid @RequestBody MemberRequestVo memberRequestVo) {
		logger.info("Started saving entity!"+memberRequestVo.toString());
		member=service.save(modelMapper.map(memberRequestVo, Member.class));
		//if(member.isPresent()) {
			memberResponseVo.setMember(modelMapper.map(member, MemberVo.class));
			memberResponseVo.setCode(Constants.CREATED);
			memberResponseVo.setName(Constants.CREATED_NAME);
			memberResponseVo.setMessage("Mmber created successfully!!");
		/*}else {
			memberResponseVo.setCode(Constants.NON_Authoritative_Information);
			memberResponseVo.setName("FAILED");
			memberResponseVo.setMessage("Mmber not created!!");
		}*/
		//memberResponseVo.getMember().add(linkTo(MemberShipController.class).slash(memberResponseVo.getMember().getId()).withSelfRel());
       // memberResponseVo.getMember().add(linkTo(MemberShipController.class).slash(memberResponseVo.getMember().getId()).withRel("member"));
		return new ResponseEntity<MemberResponseVo>(memberResponseVo, HttpStatus.EXPECTATION_FAILED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> saveOrUpdate(@Valid @RequestBody MemberVo memberVo,@PathVariable Long id) {
		//memberVo.setMember(service.saveOrUpdate(newMember));
		return new ResponseEntity<MemberVo>(memberVo, HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<MemberVo> findById(@PathVariable Long id) {
		Optional<Member> member = service.findById(id);
		if (member.isPresent())
			//memberVo.setMember(member.get());
		//selse
			throw new ResourceNotFoundException("Member not found!!");
		return new ResponseEntity<MemberVo>(memberVo, HttpStatus.FOUND);
	}

	@GetMapping
	public ResponseEntity<?> findAll(@RequestParam(defaultValue = "0") Integer pageNo,
			@RequestParam(defaultValue = "20") Integer pageSize, @RequestParam(defaultValue = "id") String sortBy) {
		List<Member> members=service.findAll(pageNo, pageSize, sortBy);
		return new ResponseEntity<>(members, HttpStatus.FOUND);
	}

	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteById(@PathVariable Long id){
		service.deleteById(id);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}

	
	
	@GetMapping("/dummy")
	public MemberVo dummy(){
		return new MemberVo();
	}

	
	
	
}
