package com.cg.project.Exception;

public class InvalidNumberRangeException extends Exception {

	public InvalidNumberRangeException() {
		super();
	}
	public InvalidNumberRangeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidNumberRangeException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidNumberRangeException(String message) {
		super(message);
	}

	public InvalidNumberRangeException(Throwable cause) {
		super(cause);
	}
}
