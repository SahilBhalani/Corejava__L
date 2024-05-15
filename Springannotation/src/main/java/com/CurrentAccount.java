package com;

import org.springframework.stereotype.Component;

@Component
public class CurrentAccount implements Account {

	
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
		System.out.println("Currentaccounnt balance is 56000");

	}

}
