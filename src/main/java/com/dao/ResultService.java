package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Result;


@Service
public class ResultService {
@Autowired
ResultDAO resultdaoimpl;
	
	public void add(Result result) {
		resultdaoimpl.addResult(result);
	}
	
	public Result find(int id) {
		return resultdaoimpl.findresult(id);
	}
	
	public List<Result> findAll() {
		return resultdaoimpl.findAllResult();
	}
	
	public boolean update(Result result) {
		return resultdaoimpl.updateResult(result);
	}
	
	public boolean delete(int id) {
		return resultdaoimpl.deleteResult(id);
	}
}