package com.business.memberservice.vo;
import java.util.HashSet;
import java.util.Set;



import org.springframework.stereotype.Component;





@Component
public class MemberShipPlanVo {

	  private Long id;
	  private String planName;
	  private String description;
	  private String duration;
	  private Double amount;
	  private Set<MemberVo> Members = new HashSet<>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return planName;
	}
	public void setName(String name) {
		this.planName = name;
	}
	public String getDesc() {
		return description;
	}
	public void setDesc(String desc) {
		this.description = desc;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Set<MemberVo> getMembers() {
		return Members;
	}
	public void setMembers(Set<MemberVo> members) {
		Members = members;
	}
	  
	
		
 
}
