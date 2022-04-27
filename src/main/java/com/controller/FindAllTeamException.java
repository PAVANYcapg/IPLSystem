package com.controller;

@SuppressWarnings("serial")
public class FindAllTeamException extends RuntimeException{

	public FindAllTeamException() {
		super("Team is not avliable in database");
	}
	
	@Override
	public String toString() {
		return "Team is not avliable in database";
	}
}
