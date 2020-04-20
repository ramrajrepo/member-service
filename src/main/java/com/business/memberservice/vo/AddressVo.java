package com.business.memberservice.vo;


import org.springframework.stereotype.Component;

@Component
public class AddressVo {



    private String addressType;
    
    private String addressLine1;
    
    private String addressLine2;

    private String street;

    private String city;

    private String state;

    private String country;

    private String zipCode;
    
    private MemberVo member;
    
    

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
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

	public MemberVo getMember() {
		return member;
	}

	public void setMember(MemberVo member) {
		this.member = member;
	}
    
    
    


    
    
}
