package com.business.memberservice.exception;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.data.rest.core.RepositoryConstraintViolationException;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.bind.MethodArgumentNotValidException;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

	


	     @ExceptionHandler(Exception.class)
	     public ResponseEntity<Object> handleAccessDeniedException(Exception ex, WebRequest request) {
	    return new ResponseEntity<Object>(ex.getLocalizedMessage(),new HttpHeaders(),HttpStatus.PARTIAL_CONTENT);
           }
	     
	     
	     @ExceptionHandler(ResourceNotFoundException.class)
	     public ResponseEntity<Object> handleAccessDeniedException(ResourceNotFoundException ex, WebRequest request) {
	     return new ResponseEntity<Object>(ex.getMessage(),new HttpHeaders(),HttpStatus.NOT_FOUND);
           }
	
    
}
