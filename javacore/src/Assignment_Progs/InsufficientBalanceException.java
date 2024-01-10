package Assignment_Progs;

public class InsufficientBalanceException extends Exception
{
	double need;
	public InsufficientBalanceException(double need) {
		// TODO Auto-generated constructor stub
		this.need = need;
	}
	
	public void getmessage()
	{
		System.err.println("You need more : "+need);
	}
}

