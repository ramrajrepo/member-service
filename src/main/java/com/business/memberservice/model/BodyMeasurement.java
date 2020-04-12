package com.business.memberservice.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "body_measurement")
public class BodyMeasurement {

	
	    @Id
	    @GeneratedValue
	    private int id;

	    @Column(name = "height_in_cms")
	    private int heightInCms;

	    @Column(name = "weight_in_kgs")
	    private int weightInKgs;

	    @Column(name = "biceps_in_cms")
	    private int bicepsInCms;

	    @Column(name = "date_of_measurement")
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
