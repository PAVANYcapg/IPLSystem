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
	public void addResult(Result result) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(result);
		session.flush();
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public Result findresult(int id) {
		Session session = sessionFactory.openSession();
		Result result = session.get(Result.class, id); 
		return result;
	}
	@Override
	public List<Result> findAllResult() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Result> result=session.createQuery("select i from Result i").list();
		return result;
	}
	@Override
	public boolean updateResult(Result result) {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(result);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}
	@Override
	public boolean deleteResult(int id) {
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