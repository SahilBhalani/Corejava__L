package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("loan")

public class LoanAccont implements Account {
	
	@Autowired
	@Qualifier("u1")
	User user;

	@Override
	public void deposit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub

	}

		
	@Override
	public void getbalance() {
		System.out.println("LoanBAlance Is 45000");
		user.basicinfo();
	
		

	}

}
