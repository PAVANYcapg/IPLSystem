package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.System;

@Repository
public interface SystemDAO {

	public void addTeam(System team);
	public System findteam(int id);
	public List<System> findAllTeam();
	public boolean updateTeam(System team);
	public boolean deleteTeam(int id);
}
