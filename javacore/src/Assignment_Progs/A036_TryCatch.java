package Assignment_Progs;


import java.util.Scanner;

public class A036_TryCatch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number: ");
		try 
		{
			int number = scanner.nextInt();

			System.out.println("You entered: " + number);
		}
		catch (Exception e) 
		{
		
			System.out.println("Error: Please enter a valid number.");
		}
		finally 
		{
			scanner.close();
		}
	}
}
