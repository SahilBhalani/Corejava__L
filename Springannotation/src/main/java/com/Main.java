package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Account c = con.getBean("savingsAccount",Account.class);
		Account l = con.getBean("loan",Account.class);
		Account s = con.getBean("currentAccount",Account.class);
		
		c.getbalance();
		l.getbalance();
		s.getbalance();

	}

}
