package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Bidder;

@Component
public class BidderDAOImpl implements BidderDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	public void addBidder(Bidder bidder) {
		// TODO Auto-generated method stub
			Session session=sessionFactory.openSession();
			session.getTransaction().begin();
			session.save(bidder);
			session.flush();
			session.getTransaction().commit();
			session.close();
		
	}

	public Bidder findbidder(int id) {
			Session session = sessionFactory.openSession();
			Bidder bidder = session.get(Bidder.class, id); 
			return bidder;
	}

	public List<Bidder> findAllbidder() {
		// TODO Auto-generated method stub
			Session session = sessionFactory.openSession();
			@SuppressWarnings("unchecked")
			List<Bidder> bidder=session.createQuery("select i from Bidder i").list();
			return bidder;
	}

	public boolean updateBidder(Bidder bidder) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(bidder);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

	public boolean deleteBidder(int id) {
			Session session = sessionFactory.openSession();
			Bidder bidder=session.find(Bidder.class,id);
			session.getTransaction().begin();
			session.delete(bidder);
			session.flush();
			session.getTransaction().commit();
			session.close();
			return true;
	}

	@Override
	public void addTeam(Bidder bidder) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Bidder findteam(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bidder> findAllTeam() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateTeam(Bidder team) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteTeam(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}