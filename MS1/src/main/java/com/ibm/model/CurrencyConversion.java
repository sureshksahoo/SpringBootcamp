package com.ibm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
@Entity

public class CurrencyConversion {
	@Id
	@GeneratedValue
	private int id;
	@NotBlank(message="this should not be null")
	@Column
	private String countryCode;
	@Column
	private Double conversionFactor;
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public Double getConversionFactor() {
		return conversionFactor;
	}
	public void setConversionFactor(Double conversionFactor) {
		this.conversionFactor = conversionFactor;
	}
	public CurrencyConversion() {}
	public CurrencyConversion(int id, @NotBlank(message = "this should not be null") String countryCode,
			Double conversionFactor) {
		super();
		this.id = id;
		this.countryCode = countryCode;
		this.conversionFactor = conversionFactor;
	}
	@Override
	public String toString() {
		return "CurrencyConversion [id=" + id + ", countryCode=" + countryCode + ", conversionFactor="
				+ conversionFactor + "]";
	}
	

}
