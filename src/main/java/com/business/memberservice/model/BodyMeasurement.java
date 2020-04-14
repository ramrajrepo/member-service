package com.business.memberservice.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class BodyMeasurement {

	@Id
	@GeneratedValue
	private int id;

	private int heightInCms;

	private int weightInKgs;

	private int bicepsInCms;

	private LocalDateTime dateOfMeasurement;

	@ManyToOne
	@JoinColumn(name = "member_id", nullable = false)
	private Member member;

	@JsonIgnore
	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHeightInCms() {
		return heightInCms;
	}

	public void setHeightInCms(int heightInCms) {
		this.heightInCms = heightInCms;
	}

	public int getWeightInKgs() {
		return weightInKgs;
	}

	public void setWeightInKgs(int weightInKgs) {
		this.weightInKgs = weightInKgs;
	}

	public int getBicepsInCms() {
		return bicepsInCms;
	}

	public void setBicepsInCms(int bicepsInCms) {
		this.bicepsInCms = bicepsInCms;
	}

	public LocalDateTime getDateOfMeasurement() {
		return dateOfMeasurement;
	}

	public void setDateOfMeasurement(LocalDateTime dateOfMeasurement) {
		this.dateOfMeasurement = dateOfMeasurement;
	}

}
