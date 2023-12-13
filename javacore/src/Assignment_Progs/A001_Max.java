package Assignment_Progs;

import java.util.Scanner;

public class A001_Max {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The First Number :");
		int a = sc.nextInt();
		
		System.out.println("Enter The Second Number :");
		int b = sc.nextInt();
		
		System.out.println("Enter The Third Number :");
		int c = sc.nextInt();
		
		if(a>c && a>b)
		{
			System.out.println("A is Max");
		}
		
		else if(b>c)
		{
			System.out.println("B is Max");
		}
		
		else
		{
			System.out.println("C is Max");
		}
	}

}
