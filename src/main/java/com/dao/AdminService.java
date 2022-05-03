package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Admin;

@Service
public class AdminService {
@Autowired
AdminDAO admindao;

	public void addAdmin(Admin admin) {
	admindao.addAdmin(admin);
	}

	public Admin findAdmin(int id) {
		return admindao.findAdmin(id);
	}
	
	public List<Admin> findAllAdmin() {
		return admindao.findAllAdmin();
	}
	
	public boolean updateAdmin(Admin admin) {
		return admindao.updateAdmin(admin);
	}
	
	public boolean deleteAdmin(int id) {
		return admindao.deleteAdmin(id);
	}

	public boolean checkAdmin(String username, String password) {
		return false;
	}
}