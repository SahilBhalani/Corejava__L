package com;

import org.springframework.stereotype.Component;

@Component("u2")
public class User2 implements User {

	@Override
	public void basicinfo() {
		
		System.out.println("name = arun , email = Arun@gmail.com");

	}

}
