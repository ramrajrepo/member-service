package com.business.memberservice.vo.master;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;
import com.business.memberservice.vo.MemberVo;


@Component
public class DietChartVo {

	private Long id;
	private String DietChartName;
	private String DietChartDesc;
	private String category;
	private String monday;
	private String tuesday;
	private String wednesday;
	private String thursday;
	private String friday;
	private String saturday;
	private String sunday;
	private Set<MemberVo> Members = new HashSet<>();
	boolean status;
	
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDietChartName() {
		return DietChartName;
	}
	public void setDietChartName(String dietChartName) {
		DietChartName = dietChartName;
	}
	public String getDietChartDesc() {
		return DietChartDesc;
	}
	public void setDietChartDesc(String dietChartDesc) {
		DietChartDesc = dietChartDesc;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
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
	public Set<MemberVo> getMembers() {
		return Members;
	}
	public void setMembers(Set<MemberVo> members) {
		Members = members;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
 }
