package Assignment_Progs;

import java.util.Scanner;

public class A010_ASCIIValueFind {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Character : ");
		char ch =sc.next().charAt(0);
		
		System.out.println("The ASCII Value Of This Character Is :"+ (int)ch);
	}

}
