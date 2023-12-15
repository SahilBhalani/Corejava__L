package Assignment_Progs;
class Numbers
{
	public void pnum(int num,char ch)
	{
		System.out.println("The Number And Character Is : "+num+ch);
	}
	
	public void pnum(char ch,int num)
	{
		System.out.println("The Character Is :" + ch + "\nThe Number Is :" + num);
	}
}
public class A022_DiffParameters {
	public static void main(String[] args) {
		
		Numbers n1 = new Numbers();
		
		n1.pnum(20, 'S');
		n1.pnum('H', 68);
		
	}
}
