package com.ibm.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ibm.exception.CountryCodeNotFoundException;
import com.ibm.exception.CurrencyConversionException;
import com.ibm.model.CurrencyConversion;
import com.ibm.model.ResponseStatus;
import com.ibm.service.MSService;

@RestController
@CrossOrigin
@RequestMapping("/currencyconversion")
public class MSController {

	private static final String SUCCESS = "Success";

	@Autowired
	MSService msService;

	@GetMapping("/{countryCode}")
	public CurrencyConversion getConversionFactor(@PathVariable String countryCode) {
		return msService.getConversionFactor(countryCode);
	}

	@PostMapping
	public ResponseEntity<ResponseStatus> addConversionFactor(@Valid @RequestBody CurrencyConversion currencyConversion) throws CurrencyConversionException {
		ResponseStatus result=msService.addConversionFactor(currencyConversion);
		return ResponseEntity.ok(result);

	}

	@PutMapping("/{countryCode}")
	public ResponseEntity<ResponseStatus> updateConversionFactor(@PathVariable String countryCode,
			@Valid @RequestBody CurrencyConversion currencyConversion) throws CountryCodeNotFoundException {

		if (msService.updateCurrencyConversion(countryCode, currencyConversion)) {
			ResponseStatus responseStatus=new ResponseStatus();
			responseStatus.setStatus(SUCCESS);

			return ResponseEntity.ok(responseStatus);
		} else {
			return ResponseEntity.notFound().build();
		}

	}

}
