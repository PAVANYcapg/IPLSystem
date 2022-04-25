package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ResultService;
import com.model.Result;

@RestController
public class ResultController {

	@Autowired
	ResultService resultservice;
	
	@PostMapping("/addresult")
	public ResponseEntity<?> addResult(@RequestBody Result result) {
		resultservice.add(result);
		return ResponseEntity.status(HttpStatus.OK).body("Result added succesfully");
	}
	
	
	@DeleteMapping("/deleteresult/{id}")
	public ResponseEntity<?> deleteResult(@PathVariable int id) throws DeleteResultException {
		Result result = resultservice.find(id);
		if(result==null) {
			throw new DeleteResultException(id);
		}
		resultservice.delete(id);
		return ResponseEntity.ok("Result deleted succesfully");
	}
	
	
	@PatchMapping("/updateresult")
	public ResponseEntity<?> updateResult(@RequestBody Result admin) throws UpdateResultException{
		Result result1=resultservice.find(0);
		if(result1==null) {
			throw new UpdateResultException();
		}
		resultservice.update(result1);
		return ResponseEntity.ok("Result updated succesfully");
	}
	
	@GetMapping("/findresult/{id}")
	public ResponseEntity<?> findTeam(@PathVariable int id)throws FindResultException{
		
		Result result2=resultservice.find(id);
		if(result2==null) {
			throw new FindResultException(id);
		}
		resultservice.find(id);
		return ResponseEntity.ok("matchfind succesfully");
	}
	
	@GetMapping("/findallresult")
	public List<Result> findAllTeam(){
		return resultservice.findAll();	
	}
}