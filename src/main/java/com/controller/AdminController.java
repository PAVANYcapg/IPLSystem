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

import com.dao.AdminService;
import com.model.Admin;

@RestController
public class AdminController {

	@Autowired
	AdminService adminservice;
	
	@PostMapping("/addadmin")
	public ResponseEntity<?> addAdmin(@RequestBody Admin admin) {
		adminservice.addAdmin(admin);
		return ResponseEntity.status(HttpStatus.OK).body("Admin added succesfully");
	}
	
	
	@DeleteMapping("/deleteadmin/{id}")
	public ResponseEntity<?> deleteAdmin(@PathVariable int id) throws DeleteAdminException {
		Admin admin=adminservice.findAdmin(id);
		if(admin==null) {
			throw new DeleteAdminException(id);
		}
		adminservice.deleteAdmin(id);
		return ResponseEntity.ok("Admin deleted succesfully");
	}
	
	
	@PatchMapping("/updateadmin")
	public ResponseEntity<?> updateAdmin(@RequestBody Admin admin) throws UpdateAdminException{
		Admin admin1=adminservice.findAdmin(admin.getId());
		if(admin1==null) {
			throw new UpdateAdminException();
		}
		adminservice.updateAdmin(admin);
		return ResponseEntity.ok("Admin updated succesfully");
	}
	
	@GetMapping("/findadmin/{id}")
	public ResponseEntity<?> findAdmin(@PathVariable int id)throws FindAdminException{
		
		Admin admin2=adminservice.findAdmin(id);
		if(admin2==null) {
			throw new FindAdminException();
		}
		adminservice.findAdmin(id);
		return ResponseEntity.ok("element find succesfully");
	}
	
	@GetMapping("/findalladmin")
	public List<Admin> findAllAdmin(){
		return adminservice.findAllAdmin();	
	}
}
