package com.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Admin;
@Component
public class AdminDaoImpl implements  AdminDAO{

	
	@Autowired
	SessionFactory sessionfactory ;
	
	@Override
	public void addAdmin(Admin admin) {
		Session session=sessionfactory.openSession();
		session.getTransaction().begin();
		session.save(admin);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}
	@Override
	public Admin findAdmin(int id) {
		Session session = sessionfactory.openSession();
		Admin admin = session.find(Admin.class, id);
		return admin;
	}

	@Override
	public List<Admin>findAllAdmin(){
		Session session = sessionfactory.openSession();
		@SuppressWarnings("unchecked")
		List<Admin> admin=session.createQuery("select i from Admin i").list();
		return admin;
	}
	@Override
	public boolean updateAdmin(Admin admin) {
		Session session = sessionfactory.openSession();
		session.getTransaction().begin();
		session.update(admin);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean deleteAdmin(int id) {
		Session session = sessionfactory.openSession();
		Admin admin = session.find(Admin.class, id);
		session.getTransaction().begin();
		session.delete(admin);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

}