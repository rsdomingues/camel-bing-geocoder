package org.binggeocoder.exception;

public class BingGeocoderException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5215154361364750743L;

	public BingGeocoderException() {
		super();
	}

	public BingGeocoderException(String message, Throwable cause) {
		super(message, cause);
	}

	public BingGeocoderException(String message) {
		super(message);
	}

	public BingGeocoderException(Throwable cause) {
		super(cause);
	}
}
