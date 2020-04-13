package com.business.memberservice.vo;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MemberResponseVo extends Response {

	private MemberVo member;

	private List<MemberVo> members;

	public List<MemberVo> getMembers() {
		return members;
	}

	public void setMembers(List<MemberVo> members) {
		this.members = members;
	}

	public MemberVo getMember() {
		return member;
	}

	public void setMember(MemberVo member) {
		this.member = member;
	}

}
