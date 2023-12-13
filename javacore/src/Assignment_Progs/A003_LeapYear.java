package Assignment_Progs;

import java.util.Scanner;

public class A003_LeapYear {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Year :");
		int year = sc.nextInt();
		
		if(year%2==0)
		{
			System.out.println("The Year Is LeapYear");
		}
		
		else
		{
			System.out.println("The Year Is Not LeapYear");
		}
		
	}

}
