package com.tornado.ecommerce.common.exception;

public class EcommerceException extends RuntimeException {

	private static final long serialVersionUID = 1997753363232807009L;

	public EcommerceException() {
	}

	public EcommerceException(String message) {
		super(message);
	}

	public EcommerceException(Throwable cause) {
		super(cause);
	}

	public EcommerceException(String message, Throwable cause) {
		super(message, cause);
	}

	public EcommerceException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
