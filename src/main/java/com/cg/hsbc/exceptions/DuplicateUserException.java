package com.cg.hsbc.exceptions;

public class DuplicateUserException extends UserException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DuplicateUserException(String message) {
		super(message);
	}
}
