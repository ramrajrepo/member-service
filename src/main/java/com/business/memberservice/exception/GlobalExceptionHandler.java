package com.business.memberservice.exception;


import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.business.memberservice.contsant.Constants;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

	


	     @ExceptionHandler(Exception.class)
	     public ResponseEntity<Object> handleAccessDeniedException(Exception ex, WebRequest request) {
	    return new ResponseEntity<Object>(ex.getLocalizedMessage(),new HttpHeaders(),HttpStatus.PARTIAL_CONTENT);
           }
	     
	     
	     @ExceptionHandler(ResourceNotFoundException.class)
	     public ResponseEntity<?> handleAccessDeniedException(ResourceNotFoundException ex, WebRequest request) {
	     return new ResponseEntity<>(new ErrorDetails(Constants.NOT_FOUND, Constants.NOT_FOUND_NAME, ex.getMessage()),HttpStatus.NOT_FOUND);
           }
	
    
}
