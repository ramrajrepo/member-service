package com.business.memberservice.model;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;





@Entity
public class MemberShipPlan {

	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private Long id;
	  private String planName;
	  private String description;
	  private String duration;
	  private Double amount;
	  @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE})
	  private Set<Member> Members = new HashSet<>();
	  
	  
	  
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public Set<Member> getMembers() {
		return Members;
	}
	public void setMembers(Set<Member> members) {
		Members = members;
	}
	  
	
	  
	  
}
