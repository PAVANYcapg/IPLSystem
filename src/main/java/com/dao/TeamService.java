package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Team;


@Service
public class TeamService {
	
	@Autowired
	TeamDAO teamimpl;
	
	public void addTeam(Team team) {
		teamimpl.addTeam(team);
	}
	
	public Team findTeam(int id) {
		return teamimpl.findTeam(id);
	}
	
	public List<Team> findAllTeam() {
		return teamimpl.findAllTeam();
	}
	
	public boolean updateTeam(Team team) {
		return teamimpl.updateTeam(team);
	}
	
	public boolean deleteTeam(int id) {
		return teamimpl.deleteTeam(id);
	}
}
	