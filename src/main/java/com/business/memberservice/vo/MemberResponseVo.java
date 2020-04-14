package com.business.memberservice.vo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class MemberResponseVo extends Response {

	private MemberVo member;

	private List<MemberVo> members;

	
	
		
	
	
	
	
	public MemberResponseVo() {
		super();
		this.members=new ArrayList<>(0);
		this.member=null;

	}


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

	
	
	public void setMembers(List<MemberVo> members,int code,String name,String message) {
		this.members=new ArrayList<>(0);
		this.member=null;
		this.members = members;
		setCode(code);
		setName(name);
		setMessage(message);
	}

   public void setMember(MemberVo member,int code,String name,String message) {
		this.members=new ArrayList<>(0);
		this.member=null;
	   this.member = member;
		setCode(code);
		setName(name);
		setMessage(message);
	}
	
   public void setResponse(int code,String name,String message) {
		this.members=new ArrayList<>(0);
		this.member=null;
	    setCode(code);
 		setName(name);
 		setMessage(message);
 	}

@Override
public String toString() {
	return "MemberResponseVo [member=" + member + ", members=" + members + ", code=" + code + ", name=" + name
			+ ", message=" + message + ", getMembers()=" + getMembers() + ", getMember()=" + getMember()
			+ ", getCode()=" + getCode() + ", getName()=" + getName() + ", getMessage()=" + getMessage()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
 	
   
   
   
   
   
}
