package Assignment_Progs;

abstract class parent
{
	public abstract void massage();
}

class SubClassA extends parent
{
	public void massage()
	{
		System.out.println("This Is A First SubClass");
	}
}

class SubClassB extends SubClassA
{
	public void massage()
	{
		System.out.println("This Is Second SubClass");
	}
}
public class A029_AbsClassProg {

	public static void main(String[] args) {
		SubClassA s1 = new SubClassA();
		s1.massage();
		
		System.out.println();
		
		SubClassB s2 = new SubClassB();
		s2.massage();
	}
}
