package Assignment_Progs;

class Bnk
{
	double balance;
	
	public void getBalance()
	{
		System.out.println("current balance is : "+balance);
	}
	
	public void deposit(double amt)
	{
		balance += amt;
	}
	
	public void withdrow(double amt) throws InsufficientBalanceException
	{
		if(amt>balance)
		{
			//System.out.println("err");
			double need = amt-balance;
			throw new InsufficientBalanceException(need);
		}
		else
		{
			balance -=amt;
		}
	}
	
}

public class A042_WithdrawProg {
	public static void main(String[] args) {
		
		Bnk b = new Bnk();
		b.getBalance();
		
		b.deposit(10000);
		b.deposit(7000);
		
		b.getBalance();
	
		try {
			b.withdrow(11001);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getmessage();
		}
		
		b.getBalance();
		
	}
}