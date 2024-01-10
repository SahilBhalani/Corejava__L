package Assignment_Progs;
class r1 implements Runnable
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		System.out.println("Hemlo you");
	}
}
public class A044_RunnableInterface {
public static void main(String[] args) {
	
	r1 r2 = new r1();
	
	Thread t1 = new Thread(r2);
	
	t1.start();
}
}
