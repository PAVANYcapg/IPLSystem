package com.controller;

@SuppressWarnings("serial")
public class FindAllMatchException extends RuntimeException{

	public FindAllMatchException() {
		super("Team is not avliable in database");
	}
	
	@Override
	public String toString() {
		return "Team is not avliable in database";
	}
}
