package com.business.memberservice.vo;


import org.springframework.hateoas.RepresentationModel;
import org.springframework.stereotype.Component;

import com.business.memberservice.model.Member;



@Component
public class MemberVo extends RepresentationModel<MemberVo> {

private Member member;


public MemberVo() {

}


public MemberVo(Member member) {
	super();
	this.member = member;
}

public Member getMember() {
	return member;
}

public void setMember(Member member) {
	this.member = member;
}



}
