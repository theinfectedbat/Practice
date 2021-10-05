package com.test.customException;

public class InsufficientFundsException extends RuntimeException {
	
	private String message;
	
	InsufficientFundsException(String message){
		this.message=message;
	}
	

}
