package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class Empdao {

	SessionFactory sf = null;
	public Empdao() {

		sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

	}
	
	public void AddorUpdate(Employee e)
	{
		Session s = sf.openSession();
		Transaction tx = null;
		tx = s.beginTransaction();
		s.saveOrUpdate(e);
		tx.commit();
		
		
	}
}
