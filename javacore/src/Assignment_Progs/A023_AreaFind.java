package Assignment_Progs;
class Area
{
	public void findarea(int len)
	{
		System.out.println("The Area Of Square Is : "+len*len);
	}
	
	public void findarea(int len,int wid)
	{
		System.out.println("The Area OF Rectangle Is :"+len*wid);
	}
}
public class A023_AreaFind {
	public static void main(String[] args) {
		
		Area a1 = new Area();
		
		a1.findarea(30);
		a1.findarea(30, 20);
		
	}
}
