package com.controller;

import com.model.Admin;
import com.model.Match;

public class MatchData {

	private Admin admin;
	private Match match;
	
	public MatchData() {
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}
	
}
