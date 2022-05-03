package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Result;


@Service
public class ResultService {
@Autowired
ResultDAO resultdaoimpl;
	
	public void addResult(Result result) {
		resultdaoimpl.addResult(result);
	}
	
	public Result findResult(int id) {
		return resultdaoimpl.findResult(id);
	}
	
	public List<Result> findAllResult() {
		return resultdaoimpl.findAllResult();
	}
	
	public boolean updateResult(Result result) {
		return resultdaoimpl.updateResult(result);
	}
	
	public boolean deleteResult(int id) {
		return resultdaoimpl.deleteResult(id);
	}
}