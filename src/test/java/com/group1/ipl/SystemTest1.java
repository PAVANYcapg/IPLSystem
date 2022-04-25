package com.group1.ipl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dao.AdminService;
import com.dao.ResultService;
import com.dao.SystemService;
import com.dao.TeamService;

@SpringBootTest
class SystemTest1 {
	
	@Autowired
	AdminService adminservice;
	
	@Autowired
	ResultService resultservice;
	
	@Autowired
	SystemService systemservice;
	
	@Autowired
	TeamService teamservice;

}