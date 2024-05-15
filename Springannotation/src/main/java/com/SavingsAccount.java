package com;

import org.springframework.stereotype.Component;

@Component
public class SavingsAccount implements Account {

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
		System.out.println("the balance is 56000");
	}

}
