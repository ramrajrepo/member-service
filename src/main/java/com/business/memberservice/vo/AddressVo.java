package com.business.memberservice.vo;

import javax.persistence.Embeddable;
@Embeddable
public class AddressVo {


	//@Size(max = 100)
	private String address1;

	//@Size(max = 100)
	private String address2;

	//@Size(max = 100)
	private String street;

	//@Size(max = 100)
	private String city;

	//@Size(max = 100)
	private String state;

	//@Size(max = 100)
	private String country;

	//@Size(max = 32)
	private String zipCode;

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	

}
