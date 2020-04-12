package com.business.memberservice.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

import java.util.List;
import javax.persistence.OneToOne;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;





@Entity
public class Member {

	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private Long id;
	  private String memberId;
	  @NotNull(message="Full name should not be empety!")
	  private String fullName;
	  @NotNull(message="Gender should not be empety!")
	  private String gender;
	  @NotNull(message="Date of birth should not be empety!")
	  private String dob;
	  @OneToMany
	  @JoinColumn(name = "address")
	  private List<Address> address;
	  @Email(message="Invalid email !")
	  private String email;
	  @Pattern(regexp="(^$|[0-9]{10})")
	  private String MobileNo;
	  private String idType;
	  private String idNo;
	  private String idCopy;
	  private String photo;
	  private String shift;
	  private Long membershipPlanId;
	  @OneToMany
	  @JoinColumn(name = "bodyMeasurements")
	  private List<BodyMeasurement> bodyMeasurements = new ArrayList<>(0);
	  private Long trainerId;
	  @OneToOne(fetch = FetchType.LAZY)
	  private DietChart dietChart;
	  private LocalDateTime joiningDate;
	  private boolean isActive;
	  @CreationTimestamp
	  private LocalDateTime createDateTime;
	  @UpdateTimestamp
	  private LocalDateTime updateDateTime;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
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
	public Long getMembershipPlanId() {
		return membershipPlanId;
	}
	public void setMembershipPlanId(Long membershipPlanId) {
		this.membershipPlanId = membershipPlanId;
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
	public LocalDateTime getCreateDateTime() {
		return createDateTime;
	}
	public void setCreateDateTime(LocalDateTime createDateTime) {
		this.createDateTime = createDateTime;
	}
	public LocalDateTime getUpdateDateTime() {
		return updateDateTime;
	}
	public void setUpdateDateTime(LocalDateTime updateDateTime) {
		this.updateDateTime = updateDateTime;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
