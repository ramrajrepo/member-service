package com.business.memberservice.vo;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.stereotype.Component;
import com.business.memberservice.vo.master.DietChartVo;
import com.business.memberservice.vo.master.WorkOutChartVo;

@Component
public class MemberVo extends RepresentationModel<MemberVo>{

	private Long id;
	private String memberId;
	@NotNull(message="First name should not be empty!")
	private String firstName;
	private String lastName;
    @NotNull(message="Gender should not be empety!")
	private String gender;
	private LocalDate dob;
	@Email(message="Invalid email id !")
	private String emailId;
	private String contactNo;
	private String altContactNo;
	private String idProofType;
	private String idProofNo;
	private Set<AddressVo> addresses = new HashSet<>();
	private Set<MemberShipVo> memberShips = new HashSet<>();
	private List<BodyMeasurementVo> bodyMeasurements = new ArrayList<>();
	private DietChartVo dietChart;
	private WorkOutChartVo workOutChart;
	private LocalDate joiningDate;
	private boolean status;
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getAltContactNo() {
		return altContactNo;
	}
	public void setAltContactNo(String altContactNo) {
		this.altContactNo = altContactNo;
	}
	public String getIdProofType() {
		return idProofType;
	}
	public void setIdProofType(String idProofType) {
		this.idProofType = idProofType;
	}
	public String getIdProofNo() {
		return idProofNo;
	}
	public void setIdProofNo(String idProofNo) {
		this.idProofNo = idProofNo;
	}
	public Set<AddressVo> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<AddressVo> addresses) {
		this.addresses = addresses;
	}
	public Set<MemberShipVo> getMemberShips() {
		return memberShips;
	}
	public void setMemberShips(Set<MemberShipVo> memberShips) {
		this.memberShips = memberShips;
	}
	public List<BodyMeasurementVo> getBodyMeasurements() {
		return bodyMeasurements;
	}
	public void setBodyMeasurements(List<BodyMeasurementVo> bodyMeasurements) {
		this.bodyMeasurements = bodyMeasurements;
	}
	public DietChartVo getDietChart() {
		return dietChart;
	}
	public void setDietChart(DietChartVo dietChart) {
		this.dietChart = dietChart;
	}
	public WorkOutChartVo getWorkOutChart() {
		return workOutChart;
	}
	public void setWorkOutChart(WorkOutChartVo workOutChart) {
		this.workOutChart = workOutChart;
	}
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
	}

