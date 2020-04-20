package com.business.memberservice.vo.master;
import java.util.HashSet;
import java.util.Set;


import org.springframework.stereotype.Component;
import com.business.memberservice.vo.MemberShipVo;





@Component
public class MemberShipPlanVo {

	 private Long id;
	  private String planName;
	  private String description;
	  private String duration;
	  private Double amount;
	  private Set<MemberShipVo> MemberShips = new HashSet<>();
	  private MemberShipTypeVo memberShipType;
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
	public Set<MemberShipVo> getMemberShips() {
		return MemberShips;
	}
	public void setMemberShips(Set<MemberShipVo> memberShips) {
		MemberShips = memberShips;
	}
	public MemberShipTypeVo getMemberShipType() {
		return memberShipType;
	}
	public void setMemberShipType(MemberShipTypeVo memberShipType) {
		this.memberShipType = memberShipType;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	  
	  
	  
	  
	  
	
}
