package com.ibm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.model.CurrencyConversion;
@Repository
public interface CurrencyConversionRepoisitory extends  JpaRepository<CurrencyConversion, String> {
	CurrencyConversion findByCountryCode(String countryCode);

}
