package HackerRank;

class SampleDemo implements Runnable {
	
	private Thread t;
	private String threadName;
	
	SampleDemo (String threadName){
		this.threadName = threadName;
	}

	
	public void run() {
		// TODO Auto-generated method stub
		while (true)
			System.out.println(threadName);
	}
	
	public void start() {
		if(t==null)
		{
			t = new Thread(this, threadName);
			t.start();
		}
	}
}


public class Ht1  {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		SampleDemo A = new SampleDemo("A");
		SampleDemo B = new SampleDemo("B");
		
		B.start();
		A.start();
		
		 
	}

}