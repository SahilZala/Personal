package com.pack.util;

import java.util.ArrayList;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.pack.model.Response;


@ControllerAdvice
public class ValidationHandler extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		ArrayList<String> error = new ArrayList<>();
		
		
		for(FieldError fe : ex.getBindingResult().getFieldErrors()) {
			error.add(fe.getField()+" : "+fe.getDefaultMessage());
		}
		
		
		return new ResponseEntity<>(new Response("",HttpStatus.BAD_REQUEST.value(),	error.get(0), "", null),HttpStatus.BAD_REQUEST);
	}
	
}
