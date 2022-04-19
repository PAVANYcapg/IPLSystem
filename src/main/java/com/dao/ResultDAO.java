package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Result;

@Repository
public interface ResultDAO {

	public void addTeam(Result team);
	public Result findteam(int id);
	public List<Result> findAllTeam();
	public boolean updateTeam(Result team);
	public boolean deleteTeam(int id);
}
