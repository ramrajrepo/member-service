package com.business.memberservice.exception;

public class ErrorDetails {
   

	 int code;
	 String name;
	 String message;
	 
	 
	 
	 
	 
	 
	
	
	public ErrorDetails(int code, String name, String message) {
		super();
		this.code = code;
		this.name = name;
		this.message = message;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
  
}
