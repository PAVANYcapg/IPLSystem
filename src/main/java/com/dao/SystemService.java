package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.System;


@Service
public class SystemService {

	@Autowired
	SystemDAO systemdaoimpl;
	
	public void add(System team) {
		systemdaoimpl.addTeam(team);
	}
	
	public System findTeam(int id) {
		return systemdaoimpl.findteam(id);
	}
	
	public List<System> findAllTeam() {
		return systemdaoimpl.findAllTeam();
	}
	
	public boolean update(System team) {
		return systemdaoimpl.updateTeam(team);
	}
	
	public boolean delete(int id) {
		return systemdaoimpl.deleteTeam(id);
	}
}