package com.business.memberservice.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.business.memberservice.model.master.MemberShipPlan;

@Entity
public class MemberShip {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;	
	@ManyToOne
	private Member member;
	@ManyToOne
	MemberShipPlan memberShipPlan;
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
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public MemberShipPlan getMemberShipPlan() {
		return memberShipPlan;
	}
	public void setMemberShipPlan(MemberShipPlan memberShipPlan) {
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
