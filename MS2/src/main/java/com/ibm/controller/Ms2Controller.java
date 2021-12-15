package com.ibm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.ibm.Exception.CurrencyConversionException;
import com.ibm.model.CurrencyConversion;

@RestController
@RequestMapping("/restclient")
public class Ms2Controller {
	@Autowired
	RestTemplate restTemplate;
	@Value("${url}")
	private String url;

	@GetMapping
	public ResponseEntity<CurrencyConversion> convertCurrency(@RequestParam String countryCode,
			@RequestParam Double amount) throws CurrencyConversionException {

		CurrencyConversion response = restTemplate.getForObject(url + countryCode, CurrencyConversion.class);
		if (response != null) {
			double exchangeAmount = response.getConversionFactor() * amount;
			response.setExchangedAmount(exchangeAmount);
			return ResponseEntity.ok(response);
		} else {
			throw new CurrencyConversionException();
		}

	}

}
