package com.training.error;

@SuppressWarnings("serial")
public class NotFoundException extends Exception {
	private String msg ; 
	public NotFoundException(String msg){
		super(msg); 
		this.msg = msg ; 
	}
	@Override
	public String getMessage() {
		 return this.msg ; 
	}
}
