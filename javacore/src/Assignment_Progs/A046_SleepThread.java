package Assignment_Progs;

import java.util.Iterator;

class Thr1 extends Thread
{
	public void run()
	{
		for (int i = 0; i <=10; i++) 
		{
			System.out.println("THr1"+ "="+ i);
		}
	}
}

class Thr2 extends Thread
{
	public void run()
	{
		for (int i = 0; i <=10; i++) 
		{
		System.out.println("THr2"+ "="+ i);
		}
	}
}
public class A046_SleepThread {
public static void main(String[] args) {
	
	Thr1 tr = new Thr1();
	Thr2 tt = new Thr2();
	
	
	try {
		tt.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	tr.start();
	tt.start();

			
}
}
