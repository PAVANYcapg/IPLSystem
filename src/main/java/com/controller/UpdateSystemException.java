package com.controller;

@SuppressWarnings("serial")
public class UpdateSystemException extends RuntimeException{

	public UpdateSystemException() {
		
		super("System is not avliable in database to update");
	}
	
	@Override
	public String toString() {
		return "System is not avliable in database to update";
	}
}
