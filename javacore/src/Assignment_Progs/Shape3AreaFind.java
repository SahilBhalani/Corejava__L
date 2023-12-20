package Assignment_Progs;
abstract class Shape
{
	public abstract void RactArea(double len,double width);
	
	public abstract void SquareArea(double side);
	
	public abstract void CircleArea(double radius);
	
}

class ssArea extends Shape
{
	@Override
	public void RactArea(double len,double width)
	{
		System.out.println("The Area Of Ractangle Is : "+len*width);
	}
	
	@Override
	public void SquareArea(double side) 
	{
		System.out.println("The Area Of Square Is : "+side*side);
	}
	
	@Override
	public void CircleArea(double radius)
	{
		System.out.println("The Area Of Square Is : "+radius*3.14);
	}
}
public class Shape3AreaFind {
public static void main(String[] args) {
	ssArea a1 = new ssArea();
	
	a1.RactArea(20, 40);
	a1.SquareArea(40);
	a1.CircleArea(25);
	
}
}