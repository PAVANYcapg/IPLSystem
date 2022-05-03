package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.System;


@Service
public class SystemService {

	@Autowired
	SystemDAO systemdaoimpl;
	
	public void addSystem(System system) {
		systemdaoimpl.addSystem(system);
	}
	
	public System findSystem(int id) {
		return systemdaoimpl.findSystem(id);
	}
	
	public List<System> findAllSystem() {
		return systemdaoimpl.findAllSystem();
	}
	
	public boolean updateSystem (System team) {
		return systemdaoimpl.updateSystem(team);
	}
	
	public boolean deleteSystem(int id) {
		return systemdaoimpl.deleteSystem(id);
	}
}