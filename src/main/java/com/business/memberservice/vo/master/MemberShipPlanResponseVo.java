package com.business.memberservice.vo.master;

import java.util.ArrayList;
import java.util.List;



import org.springframework.stereotype.Component;
import com.business.memberservice.vo.ResponseVo;





@Component
public class MemberShipPlanResponseVo extends ResponseVo {

	 
	private MemberShipPlanVo memberShipPlan;

	private List<MemberShipPlanVo> memberShipPlans;

	public MemberShipPlanVo getMemberShipPlan() {
		return memberShipPlan;
	}

	public void setMemberShipPlan(MemberShipPlanVo memberShipPlan) {
		this.memberShipPlan = memberShipPlan;
	}

	public List<MemberShipPlanVo> getMemberShipPlans() {
		return memberShipPlans;
	}

	public void setMemberShipPlans(List<MemberShipPlanVo> memberShipPlans) {
		this.memberShipPlans = memberShipPlans;
	}

	
	
	  
	public void setMemberShipPlans(List<MemberShipPlanVo> memberShipPlans,int code,String name,String message) {
		this.memberShipPlans=new ArrayList<>(0);
		this.memberShipPlan=null;
		this.memberShipPlans = memberShipPlans;
		setCode(code);
		setName(name);
		setMessage(message);
	}

   public void setMemberShipPlan(MemberShipPlanVo memberShipPlan,int code,String name,String message) {
		this.memberShipPlans=new ArrayList<>(0);
		this.memberShipPlan=null;
	   this.memberShipPlan = memberShipPlan;
		setCode(code);
		setName(name);
		setMessage(message);
	}
	
   public void setResponse(int code,String name,String message) {
		this.memberShipPlans=new ArrayList<>(0);
		this.memberShipPlan=null;
	    setCode(code);
 		setName(name);
 		setMessage(message);
 	}

	
	  
	
}
