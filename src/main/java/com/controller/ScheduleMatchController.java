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

import com.dao.MatchService;
import com.model.Match;

@RestController
public class ScheduleMatchController {

	@Autowired
	MatchService matchservice;
	
	@PostMapping("/addmatch")
	public ResponseEntity<?> addMatch(@RequestBody Match match) {
		matchservice.add(match);
		return ResponseEntity.status(HttpStatus.OK).body("Match added succesfully");
	}
	
	
	@DeleteMapping("/deletematch/{id}")
	public ResponseEntity<?> deleteMatch(@PathVariable int id) throws DeleteMatchException {
		Match match=matchservice.findItem(id);
		if(match==null) {
			throw new DeleteMatchException(id);
		}
		matchservice.delete(id);
		return ResponseEntity.ok("Match deleted succesfully");
	}
	
	
	@PatchMapping("/updatematch")
	public ResponseEntity<?> updateMatch(@RequestBody Match admin) throws UpdateMatchException{
		Match match1=matchservice.findMatch(0);
		if(match1==null) {
			throw new UpdateMatchException();
		}
		matchservice.update(match1);
		return ResponseEntity.ok("Match updated succesfully");
	}
	
	@GetMapping("/findmatch/{id}")
	public ResponseEntity<?> findTeam(@PathVariable int id)throws FindMatchException{
		
		Match match2=matchservice.findMatch(id);
		if(match2==null) {
			throw new FindMatchException();
		}
		matchservice.findMatch(id);
		return ResponseEntity.ok("matchfind succesfully");
	}
	
	@GetMapping("/findallmatch")
	public List<Match> findAllTeam(){
		return matchservice.findAllTeam();	
	}
}