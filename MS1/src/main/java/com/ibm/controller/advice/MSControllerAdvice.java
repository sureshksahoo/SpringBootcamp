package com.ibm.controller.advice;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ibm.exception.CountryCodeNotFoundException;
import com.ibm.exception.CurrencyConversionException;

@RestControllerAdvice
public class MSControllerAdvice {

	@ExceptionHandler(CurrencyConversionException.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseEntity<ErrorResponse> handleTodoNotFound(CurrencyConversionException e) {
		ErrorResponse response = new ErrorResponse("Server Error-500 ", new Date(), "Unable to Convert");
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}
	@ExceptionHandler(CountryCodeNotFoundException.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public ResponseEntity<ErrorResponse> handleIDNotFoundException(CountryCodeNotFoundException e) {
		ErrorResponse response = new ErrorResponse("Bad Request-400", new Date(), "CountryCode not found!");
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
	}
}
