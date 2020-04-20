package com.business.memberservice.vo;

import java.time.LocalDateTime;
import org.springframework.stereotype.Component;


@Component
public class BodyMeasurementVo {
	private Long id;
	private String bodyType;
	private String disability;
	private int height;
    private int weight;
    private int age;
    private int biceps;
    private int bust;
	private int chest;
	private int hips;
    private LocalDateTime dateOfMeasurement;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBodyType() {
		return bodyType;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	public String getDisability() {
		return disability;
	}
	public void setDisability(String disability) {
		this.disability = disability;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getBiceps() {
		return biceps;
	}
	public void setBiceps(int biceps) {
		this.biceps = biceps;
	}
	public int getBust() {
		return bust;
	}
	public void setBust(int bust) {
		this.bust = bust;
	}
	public int getChest() {
		return chest;
	}
	public void setChest(int chest) {
		this.chest = chest;
	}
	public int getHips() {
		return hips;
	}
	public void setHips(int hips) {
		this.hips = hips;
	}
	public LocalDateTime getDateOfMeasurement() {
		return dateOfMeasurement;
	}
	public void setDateOfMeasurement(LocalDateTime dateOfMeasurement) {
		this.dateOfMeasurement = dateOfMeasurement;
	}

	
    
    
    
	
}
