package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.User;


public class UserDao {
	
	
	SessionFactory sf = null;
	public UserDao() {
		
		sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(User.class)
				.buildSessionFactory();
	}
	public int addOrUpdate(User u) {
		int i = 0;
		Transaction tx = null;
		try {
			Session s = sf.openSession();
			tx = s.beginTransaction();
			s.saveOrUpdate(u);
			i = 1;
			tx.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			i=0;
			tx.rollback();
		
		
	}
		return i;
	}
	public List<User> viewalluser() {
		
		List<User> u = new ArrayList();
		Transaction tx  =null;
		try {
			Session s = sf.openSession();
			tx = s.beginTransaction();
			u = s.createQuery("from User").list();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		return u;
	}
	
	public int deleteById(int id) {
			
			int i = 0;
			Transaction tx  =null;
			try {
				Session s = sf.openSession();
				tx = s.beginTransaction();
				User u = s.load(User.class, id);
				s.delete(u);
				i = 1;
				tx.commit();
				
			} catch (Exception e) {
				e.printStackTrace();
				i=0;
				tx.rollback();
			}
			
			
			return i;
		}
}
