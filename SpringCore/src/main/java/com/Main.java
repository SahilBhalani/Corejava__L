package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
   public static void main(String[] args) {
	
	   ClassPathXmlApplicationContext cxml = new ClassPathXmlApplicationContext("Applicationcontext.xml");
	   
	   User u = cxml.getBean(User.class, "user");
	   u.display();
}
}
