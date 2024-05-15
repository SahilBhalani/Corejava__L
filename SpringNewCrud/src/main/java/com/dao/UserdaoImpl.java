package com.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;

@Repository
@Transactional
public class UserdaoImpl implements Userdao {

	@Autowired
	SessionFactory sf;
	@Override
	public void addOrUpdateData(User u) {
		
		Session session = sf.openSession();
		Transaction tx = null;
		
		tx = session.beginTransaction();
		session.saveOrUpdate(tx);
		tx.commit();
	
	}

	@Override
	public ArrayList<User> viewAllData() {
		
		Session session = sf.openSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		return (ArrayList<User>) session.createQuery("from User").list();
	}

	@Override
	public void deleteData(int id) {
		Session session = sf.openSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		User u = session.load(User.class, id);
		session.delete(u);
		tx.commit();

	}

	@Override
	public User getById(int id) {
		Session s = sf.openSession();
		Transaction tx = null;
		tx = s.beginTransaction();
		User u = s.load(User.class, id);
		return u;
	}

}
