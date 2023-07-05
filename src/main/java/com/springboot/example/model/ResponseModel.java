package com.springboot.example.model;

public class ResponseModel {
	
	private String message;
	
	public ResponseModel(){
		
	}

	public ResponseModel(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
