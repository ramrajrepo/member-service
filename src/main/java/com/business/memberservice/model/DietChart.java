package com.business.memberservice.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class DietChart {

	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private Long id;	
	   
	    private String monday;
	    private String tuesday;
        private String wednesday;
        private String thursday;
	    private String friday;
	    private String saturday;
	    private String sunday;
	    @OneToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "member_id", nullable = false)
	    private Member member;
	    
	    
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getMonday() {
			return monday;
		}
		public void setMonday(String monday) {
			this.monday = monday;
		}
		public String getTuesday() {
			return tuesday;
		}
		public void setTuesday(String tuesday) {
			this.tuesday = tuesday;
		}
		public String getWednesday() {
			return wednesday;
		}
		public void setWednesday(String wednesday) {
			this.wednesday = wednesday;
		}
		public String getThursday() {
			return thursday;
		}
		public void setThursday(String thursday) {
			this.thursday = thursday;
		}
		public String getFriday() {
			return friday;
		}
		public void setFriday(String friday) {
			this.friday = friday;
		}
		public String getSaturday() {
			return saturday;
		}
		public void setSaturday(String saturday) {
			this.saturday = saturday;
		}
		public String getSunday() {
			return sunday;
		}
		public void setSunday(String sunday) {
			this.sunday = sunday;
		}
		public Member getMember() {
			return member;
		}
		public void setMember(Member member) {
			this.member = member;
		}
	    
	    
	    
	    
}
