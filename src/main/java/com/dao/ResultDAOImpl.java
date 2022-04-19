package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Result;

@Component
public class ResultDAOImpl implements ResultDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void addTeam(Result team) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(team);
		session.flush();
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public Result findteam(int id) {
		Session session = sessionFactory.openSession();
		Result team = session.get(Result.class, id); 
		return team;
	}
	@Override
	public List<Result> findAllTeam() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Result> teamlist=session.createQuery("select i from Result i").list();
		return teamlist;
	}
	@Override
	public boolean updateTeam(Result team) {
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
		Result result=session.find(Result.class, id);
		session.getTransaction().begin();
		session.delete(result);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

}