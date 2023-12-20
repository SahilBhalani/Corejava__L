package Assignment_Progs;

import java.util.Scanner;

class F
{
	int fact = 1;
	public void Factorial(double num)
	{
		for(int i=1;i<=num;i++)
			
			fact = fact*i;
		
			System.out.println("The Factorial Is : "+fact);
		
	}
	

	
}
public class A032_Factorial {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter The Number :");
	int num = sc.nextInt();
	
	F f1 = new F();
	f1.Factorial(num);
	
}
}
