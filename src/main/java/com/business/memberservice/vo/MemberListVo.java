package com.business.memberservice.vo;

import java.util.List;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.stereotype.Component;

import com.business.memberservice.model.Member;


@Component
public class MemberListVo extends RepresentationModel<MemberListVo> {


private List<Member> members;

public List<Member> getMembers() {
	return members;
}

public void setMembers(List<Member> members) {
	this.members = members;
}









}
