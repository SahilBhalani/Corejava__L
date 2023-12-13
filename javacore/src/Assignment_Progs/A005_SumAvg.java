package Assignment_Progs;

import java.util.Scanner;

public class A005_SumAvg {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Marks Of Subject 1 :");
		int sub1 = sc.nextInt();
		
		System.out.println("Enter The Marks Of Subject 2 :");
		int sub2 = sc.nextInt();
		
		System.out.println("Enter The Marks Of Subject 3 :");
		int sub3 = sc.nextInt();
		
		System.out.println("Enter The Marks Of Subject 4 :");
		int sub4 = sc.nextInt();
		
		System.out.println("Enter The Marks Of Subject 5 :");
		int sub5 = sc.nextInt();
		
		int sumOfSubs = sub1 + sub2 + sub3 + sub4 + sub5;
		System.out.println( "The Sum Is = "+sumOfSubs);
		
		double avg = sumOfSubs/5;
		System.out.println("The Average Is = "+avg);
	}
}
