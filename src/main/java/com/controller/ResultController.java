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
		resultservice.addResult(result);
		return ResponseEntity.status(HttpStatus.OK).body("Result added succesfully");
	}
	
	
	@DeleteMapping("/deleteresult/{id}")
	public ResponseEntity<?> deleteResult(@PathVariable int id) throws DeleteResultException {
		Result result = resultservice.findResult(id);
		if(result==null) {
			throw new DeleteResultException(id);
		}
		resultservice.deleteResult(id);
		return ResponseEntity.ok("Result deleted succesfully");
	}
	
	
	@PatchMapping("/updateresult")
	public ResponseEntity<?> updateResult(@RequestBody Result result) throws UpdateResultException{
		Result result1=resultservice.findResult(0);
		if(result1==null) {
			throw new UpdateResultException();
		}
		resultservice.updateResult(result1);
		return ResponseEntity.ok("Result updated succesfully");
	}
	
	@GetMapping("/findresult/{id}")
	public ResponseEntity<?> findResult(@PathVariable int id)throws FindResultException{
		
		Result result2=resultservice.findResult(id);
		if(result2==null) {
			throw new FindResultException(id);
		}
		resultservice.findResult(id);
		return ResponseEntity.ok("Result find succesfully");
	}
	
	@GetMapping("/findallresult")
	public List<Result> findAllResult(){
		return resultservice.findAllResult();	
	}
}