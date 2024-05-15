package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Details;
import model.Login;

public class AddUser {
	
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Login.class)
				.addAnnotatedClass(Details.class).buildSessionFactory();
		
		
		Session s = sf.openSession();
		 Transaction tx = null;
		 
		 tx = s.beginTransaction();
		 
		 Details details = new Details();
		 details.setFname("Sahil");
		 details.setLname("Bhalani");
		 details.setEmail("s@gmail.com");
		 
		 Login login = new Login();
		 login.setEmail("s@gmail.com");
		 login.setPass("s1234");
		 login.setDetails(details);
		 
		 s.save(login);
		 tx.commit();
		
		
	}

}
