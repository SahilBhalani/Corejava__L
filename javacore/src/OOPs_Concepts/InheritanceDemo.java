package OOPs_Concepts;


	class A
	{
		int id=10;
		
		public void display()
		{
			System.out.println("Display Method Running");
			System.out.println("id :"+id);
		}
	}
	
	class B extends A
	{
			public void run()
			{
				this.id=50;
				System.out.println("running Run Method");
				System.out.println("id is :"+this.id);
			}
	}
	public class InheritanceDemo {
	
	public static void main(String[] args) {
		
		B b1 = new B();
		b1.display();
		b1.run();
		
		
		
	}
}
