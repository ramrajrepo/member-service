package com.business.memberservice.vo;


import java.time.LocalDate;


import org.springframework.stereotype.Component;
import com.business.memberservice.vo.master.MemberShipPlanVo;
@Component
public class MemberShipVo {



	private Long id;	
	private MemberVo member;
	MemberShipPlanVo memberShipPlan;
	private String shift;
	private String timing;
	private LocalDate startDate;
	private LocalDate renewDate;
	private LocalDate endDate;
	private boolean status;
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public MemberVo getMember() {
		return member;
	}
	public void setMember(MemberVo member) {
		this.member = member;
	}
	public MemberShipPlanVo getMemberShipPlan() {
		return memberShipPlan;
	}
	public void setMemberShipPlan(MemberShipPlanVo memberShipPlan) {
		this.memberShipPlan = memberShipPlan;
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getRenewDate() {
		return renewDate;
	}
	public void setRenewDate(LocalDate renewDate) {
		this.renewDate = renewDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	

    
    
}
