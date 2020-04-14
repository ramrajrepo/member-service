package com.business.memberservice.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;





@Entity
public class Member {

	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private Long id;
	  private String memberId;
	  private String fullName;
	  private String gender;
	  private LocalDate dob;
      @ElementCollection(fetch = FetchType.LAZY)
	  private Set<Address> addresses = new HashSet<>();
	  private String email;
	  private String MobileNo;
	  private String idType;
	  private String idNo;
	  private String idCopy;
	  private String photo;
	  private String shift;
	  @ManyToMany(fetch = FetchType.LAZY)
	  private Set<MemberShipPlan> memberShipPlans = new HashSet<>();
	  @OneToMany(cascade = CascadeType.ALL)
	  private List<BodyMeasurement> bodyMeasurements = new ArrayList<>(0);
	  private Long trainerId;
	  @ManyToOne(fetch = FetchType.LAZY)
	  @JoinColumn(name = "dietChart_id")
	  private DietChart dietChart;
	  @ManyToOne(fetch = FetchType.LAZY)
	  @JoinColumn(name = "workoutChart_id")
	  private WorkoutChart workoutChart;
	  private LocalDateTime joiningDate;
	  private boolean isActive;
	  //@Temporal(TemporalType.TIMESTAMP)
	  private LocalDateTime createdAt;
	  //@Temporal(TemporalType.TIMESTAMP)
	  private LocalDateTime updatedAt;
	  private boolean isDeleted;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Set<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getIdNo() {
		return idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	public String getIdCopy() {
		return idCopy;
	}
	public void setIdCopy(String idCopy) {
		this.idCopy = idCopy;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	public Set<MemberShipPlan> getMemberShipPlans() {
		return memberShipPlans;
	}
	public void setMemberShipPlans(Set<MemberShipPlan> memberShipPlans) {
		this.memberShipPlans = memberShipPlans;
	}
	public List<BodyMeasurement> getBodyMeasurements() {
		return bodyMeasurements;
	}
	public void setBodyMeasurements(List<BodyMeasurement> bodyMeasurements) {
		this.bodyMeasurements = bodyMeasurements;
	}
	public Long getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(Long trainerId) {
		this.trainerId = trainerId;
	}
	public DietChart getDietChart() {
		return dietChart;
	}
	public void setDietChart(DietChart dietChart) {
		this.dietChart = dietChart;
	}
	public WorkoutChart getWorkoutChart() {
		return workoutChart;
	}
	public void setWorkoutChart(WorkoutChart workoutChart) {
		this.workoutChart = workoutChart;
	}
	public LocalDateTime getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(LocalDateTime joiningDate) {
		this.joiningDate = joiningDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	  
	
	  
	  
	  
	  
}
