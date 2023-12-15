package Assignment_Progs;

import java.util.Scanner;

public class A015_ConcString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The String :");
		String s1 = sc.nextLine();

		System.out.println("Enter The Another String :");
		String s2 = sc.nextLine();
		
		String s3 = s1+s2;
		
		System.out.println("The Concatination Of 2 Strings Is :"+s3);
		
	}
}
