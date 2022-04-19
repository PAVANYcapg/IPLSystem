package com.model;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;






@Entity
public class Tournaments {

	@Id
	@GeneratedValue
	private int tournamentid;
	
	@NotNull(message="No of teams cannot be null")
	private int numOfTeams;
	
	@NotNull(message="duration cannot be null")
	private Date duration;
	
	public Tournaments()  {}

	public int getTournamentid() {
		return tournamentid;
	}

	public void setTournamentid(int tournamentid) {
		this.tournamentid = tournamentid;
	}

	public int getNumOfTeams() {
		return numOfTeams;
	}

	public void setNumOfTeams(int numOfTeams) {
		this.numOfTeams = numOfTeams;
	}

	public Date getDuration() {
		return duration;
	}

	public void setDuration(Date i) {
		this.duration = i;
	}	
}