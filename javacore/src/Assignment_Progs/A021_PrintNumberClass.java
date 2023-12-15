package Assignment_Progs;

class PrintNumber
{
	public void printn(int num)
	{
		System.out.println("The Number Is : "+num);
	}
	
	public void printn(float ft)
	{
		System.out.println("The Float Is : "+ft);
	}
	
	public void printn(double db)
	{
		System.out.println("The Double Is : "+db);
	}
	
	public void printn(String s)
	{
		System.out.println("The String Is : "+s);
	}
	
	
}
public class A021_PrintNumberClass {

	public static void main(String[] args) {
		
		PrintNumber pn = new PrintNumber();
		
		pn.printn(20);
		pn.printn(21.354f);
		pn.printn(1234546789);
		pn.printn("Hello Bro");
		
	}
}
