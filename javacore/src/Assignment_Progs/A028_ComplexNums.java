package Assignment_Progs;

class Complex
{
	int r, i;
	public Complex(int r, int i) {
		this.r = r;
		this.i = i;
	}
	
	public void print()
	{
		System.out.println(r+" + i"+i);
	}
	
	public static Complex add(Complex c1, Complex c2)
	{
		Complex c = new Complex(0,0);
		c.i = c1.i+c2.i;
		c.r = c1.r+c2.r;
		
		return c;
	}
}	
public class A028_ComplexNums {

	public static void main(String[] args) {
		Complex co = new Complex(50, 18);
		Complex co1 = new Complex(3, 7);
		
		co.print();
		co1.print();
			
		Complex j =  Complex.add(co, co1);	
		j.print();
	}
}
