package Assignment_Progs;

class Shap
{
	public void Shap1()
	{
		System.out.println("This is a Shap.");
	}
}
class Rectangle12 extends Shap
{
	public void Rec()
	{
		System.out.println("This is rectangular shape.");
	}
}
class Circle extends Shap
{
	public void Cir()
	{
		System.out.println("This is a circular shape.");
	}
}
class Squre extends Rectangle12
{
	public void Squr()
	{
		System.out.println("Square is a rectangle.");
	}
}

public class A035_Inheritation {

	public static void main(String[] args) {

		Squre s = new Squre();
		s.Shap1();
		s.Rec();
		s.Squr();
		
	}

}