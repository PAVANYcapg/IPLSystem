package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Result;

@Repository
public interface ResultDAO {

	public void addResult(Result result);
	public Result findresult(int id);
	public List<Result> findAllResult();
	public boolean updateResult(Result result);
	public boolean deleteResult(int id);
}
