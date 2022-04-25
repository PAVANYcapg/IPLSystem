package com.controller;

@SuppressWarnings("serial")
public class UpdateResultException extends RuntimeException{

	public UpdateResultException() {
		
		super("Match is not avliable in database to update");
	}
	
	@Override
	public String toString() {
		return "Match is not avliable in database to update";
	}
}
