package com.business.memberservice.model.master;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;






@Entity
public class MemberShipType {

	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private Long id;
	  private String name;
	  private String description;
	  @OneToMany(fetch = FetchType.LAZY,mappedBy = "memberShipType",cascade = CascadeType.ALL)
	  private Set<MemberShipPlan> memberShipPlans = new HashSet<>();
	  
	  
	  
	  
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
	public Set<MemberShipPlan> getMemberShipPlans() {
		return memberShipPlans;
	}
	public void setMemberShipPlans(Set<MemberShipPlan> memberShipPlans) {
		this.memberShipPlans = memberShipPlans;
	}
	  
	  
	  
	  
	  
}
