package Assignment_Progs;
abstract class Marks
{
	public abstract void getPercentage();
}

class StudentA extends Marks
{
	double a;
	double b;
	double c;
	
	StudentA(double a,double b,double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void getPercentage()
	{
		System.out.println("Percentage Of Studentn A is ="+(a+b+c)/3);
	}
}

class StudentB extends Marks
{
	double a;
	double b;
	double c;
	double d;
	
	StudentB(double a,double b,double c,double d)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public void getPercentage()
	{
		System.out.println("Percentage Of Studentn B is ="+(a+b+c+d)/4);
	}
}

public class A031_FindPercentage {
public static void main(String[] args) {
	StudentA s1 = new StudentA(90, 80, 80);
	s1.getPercentage();
	
	StudentB s2 = new StudentB(90, 80, 80, 60);
	s2.getPercentage();
}
}
