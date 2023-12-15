package Assignment_Progs;
class MainClass
{
	public void MainMethod() 
	{
		System.out.println("This Is A Main Class");
	}
}

class ChildClass extends MainClass
{
	public void ChildMethod()
	{
		System.out.println("This Is A Child Class");
	}
}
public class A024_DiffMethodsDiffClass {
public static void main(String[] args) {
	
	MainClass Mobj = new MainClass();
	ChildClass Cobj = new ChildClass();
	
	Mobj.MainMethod();
	Cobj.ChildMethod();
	Cobj.MainMethod();
}
}