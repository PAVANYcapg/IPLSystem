package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.System;

@Component
public class SystemDAOImpl implements SystemDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void addTeam(System team) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(team);
		session.flush();
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public System findteam(int id) {
		Session session = sessionFactory.openSession();
		System team = session.get(System.class, id); 
		return team;
	}
	@Override
	public List<System> findAllTeam() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<System> teamlist=session.createQuery("select i from System i").list();
		return teamlist;
	}
	@Override
	public boolean updateTeam(System team) {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(team);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}
	@Override
	public boolean deleteTeam(int id) {
		Session session = sessionFactory.openSession();
		System system=session.find(System.class, id);
		session.getTransaction().begin();
		session.delete(system);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

}