package com.business.memberservice.vo;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.ElementCollection;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.stereotype.Component;
import com.business.memberservice.model.Address;

@Component
public class MemberVo extends RepresentationModel<MemberVo>{

	  private Long id;
	  private String memberId;
	  @NotNull(message="Full name should not be empety!")
	  private String fullName;
	  @NotNull(message="Gender should not be empety!")
	  private String gender;
	 // @NotNull(message="Date of birth should not be empety!")
	  private LocalDate dob;
      @ElementCollection
	  private Set<Address> addresses = new HashSet<>();
	  @Email(message="Invalid email !")
	  private String email;
	  @Pattern(regexp="(^$|[0-9]{10})")
	  private String MobileNo;
	  private String idType;
	  private String idNo;
	  private String idCopy;
	  private String photo;
	  private String shift;
	  private Set<MemberShipPlanVo> memberShipPlans = new HashSet<>();
      private List<BodyMeasurementVo> bodyMeasurements=new ArrayList<>(0);
	  private Long trainerId;
	  private DietChartVo dietChart;
	  private WorkoutChartVo workoutChart;
	  private LocalDateTime joiningDate;
	  private boolean isActive;
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
	public Set<MemberShipPlanVo> getMemberShipPlans() {
		return memberShipPlans;
	}
	public void setMemberShipPlans(Set<MemberShipPlanVo> memberShipPlans) {
		this.memberShipPlans = memberShipPlans;
	}
	public List<BodyMeasurementVo> getBodyMeasurements() {
		return bodyMeasurements;
	}
	public void setBodyMeasurements(List<BodyMeasurementVo> bodyMeasurements) {
		this.bodyMeasurements = bodyMeasurements;
	}
	public Long getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(Long trainerId) {
		this.trainerId = trainerId;
	}
	public DietChartVo getDietChart() {
		return dietChart;
	}
	public void setDietChart(DietChartVo dietChart) {
		this.dietChart = dietChart;
	}
	public WorkoutChartVo getWorkoutChart() {
		return workoutChart;
	}
	public void setWorkoutChart(WorkoutChartVo workoutChart) {
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
	  
	
	  
	  

	
	
		  
		  
	}

