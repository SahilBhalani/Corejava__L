package Assignment_Progs;

import java.util.Iterator;
import java.util.Scanner;

public class A007_Pattern {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = 1;
		
		System.out.println("Enter The Number :");
		int a  = sc.nextInt();
		
		for (int i = 1; i <= a; i++) 
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
			
		}
		
	}
}
