package Strings_Questions;

import java.util.Scanner;

public class Replace_Vowels {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String output = str.replaceAll("[AEIOUaeiou]", "*");
		
		System.out.println("Replaced String Is = "+output);
	}
}
