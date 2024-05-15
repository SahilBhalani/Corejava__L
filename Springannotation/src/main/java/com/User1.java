package com;

import org.springframework.stereotype.Component;

@Component("u1")
public class User1 implements User {

	@Override
	public void basicinfo() {
	
		System.out.println("Name = Sahil , Email = sahilbhalani8200@gmail.com ");

	}

}
