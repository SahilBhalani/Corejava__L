package Assignment_Progs;

import java.util.Scanner;

public class A011_InputNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter The Number :");
		
		int n = sc.nextInt();
		
		System.out.println("The Result Is : " +n + "+" + (n*10+n) + "+" + (n*100+n*10+n) );
	}
}
