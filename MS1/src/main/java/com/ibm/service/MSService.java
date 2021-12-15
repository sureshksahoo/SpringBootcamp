package com.ibm.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.dao.CurrencyConversionRepoisitory;
import com.ibm.exception.CountryCodeNotFoundException;
import com.ibm.exception.CurrencyConversionException;
import com.ibm.model.CurrencyConversion;
import com.ibm.model.ResponseStatus;

@Service
public class MSService {
	private static final String SUCCESS = "Success";
	@Autowired
	CurrencyConversionRepoisitory repository;

	public CurrencyConversion getConversionFactor(String countryCode) {
		return (CurrencyConversion) repository.findByCountryCode(countryCode);
	}

	public Boolean updateCurrencyConversion(String countryCode, @Valid CurrencyConversion currencyConversion)
			throws CountryCodeNotFoundException {
		if (countryCode.equalsIgnoreCase(currencyConversion.getCountryCode())) {
			getConversionFactor(countryCode);
			repository.save(currencyConversion);
			return true;
		} else {
			throw new CountryCodeNotFoundException();
		}
	}

	public ResponseStatus addConversionFactor(@Valid CurrencyConversion currencyConversion) throws CurrencyConversionException {
		CurrencyConversion result = repository.save(currencyConversion);
		if (result != null) {
			ResponseStatus responseStatus=new ResponseStatus();
			responseStatus.setStatus(SUCCESS);
			return responseStatus;
		    
		} else {
			throw new CurrencyConversionException();
		}
		 
	}

}
