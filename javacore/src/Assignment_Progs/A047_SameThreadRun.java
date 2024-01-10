package Assignment_Progs;
class testthreadtwice1 extends Thread
{
	public void run()
	{
		System.out.println("Running 1st Thread");
	}
}
public class A047_SameThreadRun {
public static void main(String[] args) {
	
	testthreadtwice1 t1 = new testthreadtwice1();
	
	t1.start();
	t1.start();
}
}
