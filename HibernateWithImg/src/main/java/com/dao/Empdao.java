package com.dao;

import java.util.ArrayList;
import java.util.List;

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

	public List<Employee> viewAllEmp() {
		// TODO Auto-generated method stub
		
		List<Employee> e = new ArrayList<Employee>();
		Transaction tx  =null;
		try {
			Session s = sf.openSession();
			tx = s.beginTransaction();
			e = s.createQuery("from Employee").list();
			tx.commit();
			
		} catch (Exception e1) {
			e1.printStackTrace();
			tx.rollback();
		}
		
		return e;
	}
	
	public int DeleteEmp(int id)
	{
		int i = 0;
		Transaction tx  =null;
		try {
			Session s = sf.openSession();
			tx = s.beginTransaction();
			Employee e = s.load(Employee.class, id);
			s.delete(e);
			i = 1;
			tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			i=0;
			tx.rollback();
		}
		return i;
	}
	
	public Employee GetEmpBYID(int id)
	{
		Employee e = null;;
		Transaction tx = null;
		try {
			Session s = sf.openSession();
			tx = s.beginTransaction();
			e = s.load(Employee.class, id);
			
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return e;
		
	}
	

}
