package Assignment_Progs;
class Rectangle
{
	double lenght;
	double width;
	
	 public Rectangle(double lenght,double width)
	{
		this.lenght=lenght;
		this.width=width;
	}
	
	public void Area()
	{
		double area =lenght*width;
		System.out.println("The Area Is : "+area);
	}
	
	public void perimeter()
	{
		double Perimeter = 2 * (lenght * width);
		System.out.println("The Perimeter Is :" + Perimeter);
	}
}

class square extends Rectangle
{

	public square(double side) {
		super(side, side);
		
	}
	
	public void Sqperi(double side)
	{
		System.out.println("The Perimeter Is : " +side*4);
	}
	
}

public class A026_Perimeter {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(10, 20);
		r1.Area();
		r1.perimeter();
		
		System.out.println();
		
		square s1 = new square(3);
		s1.Area();
		s1.Sqperi(3);
		
	}
}
