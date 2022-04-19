package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Result;


@Service
public class ResultService {

	@Autowired
	ResultDAO resultdaoimpl;
	
	public void add(Result team) {
		resultdaoimpl.addTeam(team);
	}
	
	public Result findTeam(int id) {
		return resultdaoimpl.findteam(id);
	}
	
	public List<Result> findAllTeam() {
		return resultdaoimpl.findAllTeam();
	}
	
	public boolean update(Result team) {
		return resultdaoimpl.updateTeam(team);
	}
	
	public boolean delete(int id) {
		return resultdaoimpl.deleteTeam(id);
	}
}