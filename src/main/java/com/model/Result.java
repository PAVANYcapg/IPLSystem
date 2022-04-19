package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "resultTable")
public class Result {
	@Id
	@GeneratedValue
	
	private int resultId;
	
	@NotNull(message="firstTeam cannot be null")
	private String firstTeam;
	
	@NotNull(message="secondTeam cannot be null")
	private String secondTeam;
	
	@NotNull(message="thirdTeam cannot be null")
	private String thirdTeam;
	
	@ManyToOne
	private System system;
	
	public Result() {
		
	}

	public int getResultId() {
		return resultId;
	}

	public void setResultId(int resultId) {
		this.resultId = resultId;
	}

	public String getFirstTeam() {
		return firstTeam;
	}

	public void setFirstTeam(String firstTeam) {
		this.firstTeam = firstTeam;
	}

	public String getSecondTeam() {
		return secondTeam;
	}

	public void setSecondTeam(String secondTeam) {
		this.secondTeam = secondTeam;
	}

	public String getThirdTeam() {
		return thirdTeam;
	}

	public void setThirdTeam(String thirdTeam) {
		this.thirdTeam = thirdTeam;
	}

	public System getSystem() {
		return system;
	}

	public void setSystem(System system) {
		this.system = system;
	}

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}