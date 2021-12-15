package com.ibm.model;

import java.io.Serializable;


public class CurrencyConversion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String countryCode;
	private Double conversionFactor;
	private Double exchangedAmount;

	public CurrencyConversion() {
	}

	public CurrencyConversion(int id, String countryCode, Double conversionFactor, Double exchangedAmount) {
		super();
		this.id = id;
		this.countryCode = countryCode;
		this.conversionFactor = conversionFactor;
		this.exchangedAmount = exchangedAmount;
	}

	public Double getExchangedAmount() {
		return exchangedAmount;
	}

	public void setExchangedAmount(Double exchangedAmount) {
		this.exchangedAmount = exchangedAmount;
	}

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

	@Override
	public String toString() {
		return "CurrencyConversion [id=" + id + ", countryCode=" + countryCode + ", conversionFactor="
				+ conversionFactor + "]";
	}

}
