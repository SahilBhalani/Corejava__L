package Assignment_Progs;
class Triangle
{
	int a;
	int b;
	int c;
	
	Triangle()
	{
	 this.a = 3;
	 this.b = 4;
	 this.c = 5;
	}
	public void Area(int base,int height)
	{
		System.out.println("Area Of Triangle Is : "+ (base*height)/2 ); 
	}
	
	public void Perimeter()
	{
		System.out.println("Perimeter Of Triangle Is :"+ (a+b+c));
	}
}
public class A027_TrianglePerimeter {

	public static void main(String[] args) {
		
		Triangle t1 = new Triangle();
		t1.Area(5, 6);
		t1.Perimeter();
	}
}
