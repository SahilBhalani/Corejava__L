package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import model.Student;

public class StudentDao {
	
	
	SessionFactory sf = null;
	public StudentDao() {
		
		sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
	}
	public int addOrUpdate(Student st) {
		
			int i = 0;
			Transaction tx = null;
			try {
				Session s = sf.openSession();
				tx = s.beginTransaction();
				s.saveOrUpdate(st);
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
	
	
	public List<Student> viewAllStd() {
		List<Student> st = new ArrayList();
		Transaction tx  =null;
		try {
			Session s = sf.openSession();
			tx = s.beginTransaction();
			st = s.createQuery("from Student").list();
			tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		return st;
	}
	
	
	public Student getByid(int id) {
		
		Student st = null;
		Transaction tx = null;
		try {
			Session s = sf.openSession();
			tx = s.beginTransaction();
			st = s.load(Student.class, id);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
			
		}
		
		return st;
	}
	public int deleteById(int id) {
		
		int i = 0;
		Transaction tx  =null;
		try {
			Session s = sf.openSession();
			tx = s.beginTransaction();
			Student st = s.load(Student.class, id);
			s.delete(st);
			i = 1;
			tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			i=0;
			tx.rollback();
		}
		
		
		return i;
	}
	public Student loginchk(Student s) {
		
		Session session = sf.openSession();
		Transaction tx = null;

		tx = session.beginTransaction();
		
		Query q = session.createQuery("from Student std where std.email=:abs and std.pass=:xyz");
		q.setParameter("abs", s.getEmail());
		q.setParameter("xyz", s.getPass());
		
		Student std = (Student) q.uniqueResult();
		
		return std;
		
	}
	
	
	
	
	
	
		
	

}
