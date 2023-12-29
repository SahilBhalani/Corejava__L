package Assignment_Progs;
import java.util.Scanner;
import Assignment_Progs.NotValidException;

class Age
{    
	int Age;
	public void AgeCheck(int Age) throws NotValidException
	{
		
		
		
		if(Age < 18)
		{
			int AgeCk = 18 - Age;
			throw new NotValidException(AgeCk);
		}
		
		else 
		{
			System.out.println("You Are Eligible To Vote!");
		}
	}
}


public class A041_Voting {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Age :");
		int Age = sc.nextInt();
		
		Age a1 = new Age();

		
		try {
			a1.AgeCheck(Age);
		}
		catch(NotValidException e)
		{
			e.printStackTrace();
			e.getMsg();
		}
		
		
		
	}

}