package com.business.memberservice.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import com.business.memberservice.model.master.DietChart;
import com.business.memberservice.model.master.WorkOutChart;

@Entity
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String memberId;
	private String firstName;
	private String lastName;
	private String gender;
	private LocalDate dob;
	private String emailId;
	private String contactNo;
	private String altContactNo;
	private String idProofType;
	private String idProofNo;
	private String photoUrl;
	private String idProofUrl;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "member")
	private Set<Address> addresses = new HashSet<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "member")
	private Set<MemberShip> memberShips = new HashSet<>();
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<BodyMeasurement> bodyMeasurements = new ArrayList<>();
	@ManyToOne(fetch = FetchType.LAZY)
	private DietChart dietChart;
	@ManyToOne(fetch = FetchType.LAZY)
	private WorkOutChart workOutChart;
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
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public String getIdProofUrl() {
		return idProofUrl;
	}
	public void setIdProofUrl(String idProofUrl) {
		this.idProofUrl = idProofUrl;
	}
	public Set<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
	public Set<MemberShip> getMemberShips() {
		return memberShips;
	}
	public void setMemberShips(Set<MemberShip> memberShips) {
		this.memberShips = memberShips;
	}
	public List<BodyMeasurement> getBodyMeasurements() {
		return bodyMeasurements;
	}
	public void setBodyMeasurements(List<BodyMeasurement> bodyMeasurements) {
		this.bodyMeasurements = bodyMeasurements;
	}
	public DietChart getDietChart() {
		return dietChart;
	}
	public void setDietChart(DietChart dietChart) {
		this.dietChart = dietChart;
	}
	public WorkOutChart getWorkOutChart() {
		return workOutChart;
	}
	public void setWorkOutChart(WorkOutChart workOutChart) {
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
