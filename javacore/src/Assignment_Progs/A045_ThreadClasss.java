package Assignment_Progs;
class Th1 extends Thread
{
	public void run()
	{
		System.out.println("Running 1st Thread");
	}
}

class Th2 extends Thread
{
	public void run()
	{
		System.out.println("Running 2nd Thread");
	}
}


public class A045_ThreadClasss {
public static void main(String[] args) {
	
	Th1 dp = new Th1();
	Th2 di = new Th2();
	
	dp.start();
	di.start();
}
}
