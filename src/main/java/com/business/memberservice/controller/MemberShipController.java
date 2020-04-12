package com.business.memberservice.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import com.business.memberservice.model.Member;
import com.business.memberservice.service.MemberService;
import com.business.memberservice.vo.MemberListVo;
import com.business.memberservice.vo.MemberVo;

@RestController
@RequestMapping("/member")
public class MemberShipController {

	@Autowired
	private MemberService service;
	@Autowired
	private MemberVo memberVo;
	@Autowired
	private MemberListVo memberListVo;

	@PostMapping
	public ResponseEntity<?> create(@Valid @RequestBody Member newMember) {
		memberVo.setMember(service.saveEntityService(newMember));
		memberVo.add(linkTo(MemberShipController.class).slash(memberVo.getMember().getId()).withSelfRel());
		memberVo.add(linkTo(MemberShipController.class).slash(memberVo.getMember().getId()).withRel("member"));
		return new ResponseEntity<MemberVo>(memberVo, HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<?> update(@Valid @RequestBody Member newMember) {
		memberVo.setMember(service.updateEntityService(newMember));
		memberVo.add(linkTo(MemberShipController.class).slash(memberVo.getMember().getId()).withSelfRel());
		memberVo.add(linkTo(MemberShipController.class).slash(memberVo.getMember().getId()).withRel("member"));
		return new ResponseEntity<MemberVo>(memberVo, HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<MemberVo> get(@PathVariable Long id) {
		Optional<Member> member = service.getEntityService(id);
		if (member.isPresent())
			memberVo.setMember(member.get());
		else
			throw new ResourceNotFoundException("Member not found!!");
		return new ResponseEntity<MemberVo>(memberVo, HttpStatus.FOUND);
	}

	@GetMapping
	public ResponseEntity<MemberListVo> getAll(@RequestParam(defaultValue = "0") Integer pageNo,
			@RequestParam(defaultValue = "20") Integer pageSize, @RequestParam(defaultValue = "id") String sortBy) {
		memberListVo.setMembers(service.getAllEntityService(pageNo, pageSize, sortBy));
		return new ResponseEntity<>(memberListVo, HttpStatus.FOUND);
	}

	
	@GetMapping("/dummey")
	public Member dummy() {
			return new Member();
	}
	
	
}
