package com.business.memberservice.vo.master;
import java.util.HashSet;
import java.util.Set;


import org.springframework.stereotype.Component;






@Component
public class MemberShipTypeVo {

	  private Long id;
	  private String name;
	  private String description;
	  private Set<MemberShipPlanVo> memberShipPlans = new HashSet<>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<MemberShipPlanVo> getMemberShipPlans() {
		return memberShipPlans;
	}
	public void setMemberShipPlans(Set<MemberShipPlanVo> memberShipPlans) {
		this.memberShipPlans = memberShipPlans;
	}
	  
	  
	  

	  
	  
	  
}
