package Assignment_Progs;

import java.util.Scanner;

public class A018_StrClrCheck {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The String:");
		String s1 = sc.nextLine();
		
		System.out.println(s1.startsWith("red"));
		
		System.out.println("Enter The Another String:");
		String s2 = sc.nextLine();
		
		System.out.println(s2.startsWith("reds"));
	}
}
