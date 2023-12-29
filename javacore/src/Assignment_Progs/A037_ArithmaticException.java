package Assignment_Progs;


import java.util.Scanner;

public class A037_ArithmaticException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Value Of Num 1 :");
		int num1 = sc.nextInt();

		System.out.println("Enter The Value Of Num 2 :");
		int num2 = sc.nextInt();

		try 
		{
			System.out.println(num1 / num2);
		}
		catch(ArithmeticException e) 
		{
			e.printStackTrace();
			System.out.println("Your Program is Runing");
		}
		finally 
		{
			sc.close();
		}

	}

}