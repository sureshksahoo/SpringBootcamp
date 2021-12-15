package com.ibm.exception;

public class CurrencyConversionException  extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CurrencyConversionException() {
        super();
    }
    public CurrencyConversionException(String message, Throwable cause) {
        super(message, cause);
    }
    public CurrencyConversionException(String message) {
        super(message);
    }
    public CurrencyConversionException(Throwable cause) {
        super(cause);
    }

}
