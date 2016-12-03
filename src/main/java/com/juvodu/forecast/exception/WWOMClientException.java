package com.juvodu.forecast.exception;

/**
 * The Class WWOMClientException.
 * 
 * @author Juri Tichomirow
 */
public class WWOMClientException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new WWOM client exception.
	 *
	 * @param message
	 *            the message
	 */
	public WWOMClientException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new WWOM client exception.
	 *
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public WWOMClientException(String message, Throwable cause) {
		super(message, cause);
	}
}
