package Assignment_Progs;

class tr1 extends Thread
{
	
	public void run()
	{
		if(currentThread().isDaemon())
		{
			System.out.println("THe Threaad is deamon");
		}
		else
		{
			System.out.println("The file is not deamon");
		}
	}
}


public class A048_DeamonThread {
public static void main(String[] args) {
	
	tr1 t1 = new tr1();
	tr1 t2 = new tr1();
	tr1 t3 = new tr1();
	
	t1.setDaemon(true);
	
	t1.start();
	t2.start();
	t3.start();
}
}
