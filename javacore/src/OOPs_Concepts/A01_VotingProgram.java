package OOPs_Concepts;

import java.util.Scanner;

class Age
{    
	int Age;
	public void AgeCheck(int Age) throws AgeNotValidException
	{
		
		
		
		if(Age < 18)
		{
			int AgeCk = 18 - Age;
			throw new AgeNotValidException(AgeCk);
		}
		
		else 
		{
			System.out.println("You Are Eligible To Vote!");
		}
	}
}


public class A01_VotingProgram {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Age :");
		int Age = sc.nextInt();
		Age a1 = new Age();

		
		try {
			a1.AgeCheck(Age);
		}
		catch(AgeNotValidException e)
		{
			e.printStackTrace();
			e.getMsg();
		}
		
		
		
	}

}
