package com.business.memberservice.vo;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class BodyMeasurementVo {

	private Long id;

	private int heightInCms;

	private int weightInKgs;

	private int bicepsInCms;

	private LocalDateTime dateOfMeasurement;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
