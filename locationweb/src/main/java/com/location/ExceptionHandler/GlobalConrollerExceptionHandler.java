package com.location.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpServerErrorException;

@ControllerAdvice
public class GlobalConrollerExceptionHandler {

	@ExceptionHandler(ValidationException.class)
	public ResponseEntity<ErrorDetails> handleValidationException(ValidationException validationException) {
		ErrorDetails errorDetail = new ErrorDetails();
		
		errorDetail.setMsg(validationException.getMessage());
		errorDetail.setStatusCode(HttpStatus.METHOD_NOT_ALLOWED.value());
		
		ResponseEntity<ErrorDetails> response = new ResponseEntity<ErrorDetails>(errorDetail, HttpStatus.METHOD_NOT_ALLOWED);
		
		return response;
	}

}
