package com.business.memberservice.model.master;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.business.memberservice.model.MemberShip;





@Entity
public class MemberShipPlan {

	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private Long id;
	  private String planName;
	  private String description;
	  private String duration;
	  private Double amount;
	  @OneToMany(fetch = FetchType.LAZY)
	  private Set<MemberShip> MemberShips = new HashSet<>();
	  @ManyToOne
	  private MemberShipType memberShipType;
	  private boolean status;
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
	public Set<MemberShip> getMemberShips() {
		return MemberShips;
	}
	public void setMemberShips(Set<MemberShip> memberShips) {
		MemberShips = memberShips;
	}
	public MemberShipType getMemberShipType() {
		return memberShipType;
	}
	public void setMemberShipType(MemberShipType memberShipType) {
		this.memberShipType = memberShipType;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	  
	  
	
	  
	  
}
