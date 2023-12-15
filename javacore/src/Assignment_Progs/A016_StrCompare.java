package Assignment_Progs;

import java.util.Scanner;

public class A016_StrCompare {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A String :");
		String s1 = sc.nextLine();
		
		System.out.println("Enter The Another String :");
		String s2 = sc.nextLine();
		
		System.out.println(s1.equals(s2));
	}
}
