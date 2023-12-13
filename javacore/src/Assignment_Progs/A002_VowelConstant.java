package Assignment_Progs;

import java.util.Scanner;

public class A002_VowelConstant {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter The Alphabet :");
		String s = scan.next();		
			
			if( s.equals("a")|| s.equals("e") ||s.equals("i") || s.equals("o")|| s.equals("u") || 
					s.equals("A")|| s.equals("E") ||s.equals("I") || s.equals("O")|| s.equals("U") )
			{
				System.out.println("Vowel");
			}
		
			else if(!s.matches("[A-Za-z]") && s.length() >= 1)
			{
				System.out.println("Error");
			}
		
			else
			{
				System.out.println("Constant");
			}
	}

}
