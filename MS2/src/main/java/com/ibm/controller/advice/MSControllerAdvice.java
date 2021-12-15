package com.ibm.controller.advice;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ibm.Exception.CurrencyConversionException;

@RestControllerAdvice
public class MSControllerAdvice {

	@ExceptionHandler(CurrencyConversionException.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseEntity<ErrorResponse> handleTodoNotFound(CurrencyConversionException e) {
		ErrorResponse response = new ErrorResponse("Server Error-500 ", new Date(), "Unable to Convert");
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}
	
}
