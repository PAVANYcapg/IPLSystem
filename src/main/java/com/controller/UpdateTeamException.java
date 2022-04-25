package com.controller;

@SuppressWarnings("serial")
public class UpdateTeamException extends RuntimeException{

	public UpdateTeamException() {
		super("Team is not avliable in database to update");
	}
	
	@Override
	public String toString() {
		return "Team is not avliable in database to update";
	}
}
