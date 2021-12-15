package com.ibm.exception;

public class CountryCodeNotFoundException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CountryCodeNotFoundException() {
        super();
    }
    public CountryCodeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    public CountryCodeNotFoundException(String message) {
        super(message);
    }
    public CountryCodeNotFoundException(Throwable cause) {
        super(cause);
    }

}
