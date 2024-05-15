package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Details;
import model.Login;

public class DeleteUser {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Login.class)
				.addAnnotatedClass(Details.class).buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tx = null;
		
		tx = s.beginTransaction();
		
		Login login = s.load(Login.class, 1);
		
		s.delete(login);
		
		tx.commit();
		
	}
}
