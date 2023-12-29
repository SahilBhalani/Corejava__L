package Assignment_Progs;


import java.util.Scanner;

public class A039_TryCatchBlock {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Value :");
		
		int a[]= new int [3];
		for(int i=0; i<=3; i++)
		{
			a[i] =sc.nextInt();
			try
			{
				a[i] = a[i]/0;
			} 
			catch (ArrayIndexOutOfBoundsException e) 
			{
				e.printStackTrace();
			}
			catch (ArithmeticException e) 
			{
				e.printStackTrace();
			}
		}
		
	}

}