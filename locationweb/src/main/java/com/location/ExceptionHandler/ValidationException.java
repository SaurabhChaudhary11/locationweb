package com.location.ExceptionHandler;


public class ValidationException extends RuntimeException {

	private String message;
	public ValidationException(String message) {
		
		this.message=message;
	}
	
	public String getMessage(){
		return this.message;
	}
}
