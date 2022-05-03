package com.group1.ipl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dao.AdminService;
import com.model.Admin;

import java.util.List;
import junit.framework.Assert;
@SpringBootTest
class AdminTest1 {

	@Autowired
	AdminService adminservice;
	
	@Test
	void testAdd() {
		Admin admin = new Admin();
		admin.setUsername("Nihal");
		admin.setPassword("@123");
		adminservice.addAdmin(admin);
		
		Admin admin_to_be_tested = adminservice.findAdmin(admin.getId());
		Assert.assertEquals("Nihal", admin_to_be_tested.getUsername());
		Assert.assertEquals("@123", admin_to_be_tested.getPassword());
	}

	@Test
	void testFind() {
		Admin admin = new Admin();
		admin.setUsername("Pradeep");
		admin.setPassword("@1234");
		adminservice.addAdmin(admin);
		
		Admin admin_to_be_tested = adminservice.findAdmin(admin.getId());
		Assert.assertEquals("Pradeep", admin_to_be_tested.getUsername());
		Assert.assertEquals("@1234", admin_to_be_tested.getPassword());
     }

	@Test
	void testFindAll() {
		Admin admin = new Admin();
		admin.setUsername("Ranjan");
		admin.setPassword("@12345");
		adminservice.addAdmin(admin);
		
		List<Admin> add =  adminservice.findAllAdmin();
		Assert.assertEquals("Ranjan", add.get(1).getUsername());
		
	}
     		
		

	@Test
	void testUpdate() {
		Admin admin=new Admin();
		admin.setUsername("Chitira");
		admin .setPassword("#20101");
		adminservice.addAdmin(admin);
		adminservice.updateAdmin(admin);
		Assert.assertEquals(true, adminservice.updateAdmin(admin));
	}

	@Test
	void testDelete() {
		adminservice.deleteAdmin(2);
		Admin admin1 = adminservice.findAdmin(2);

		Assert.assertNull(admin1);
		
	}

	//@SuppressWarnings("unused")
	//private Object Admin(int i) {
	//	return null;
	//}

}