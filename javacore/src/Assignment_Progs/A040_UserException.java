package Assignment_Progs;

import java.util.Scanner;

public class A040_UserException {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter The Number : ");
	int i = sc.nextInt();
	
	System.out.println("Enter The Second Number : ");
	int j = sc.nextInt();
	
	try {
		int sum = i/j;
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
	
	}
	
}

}
