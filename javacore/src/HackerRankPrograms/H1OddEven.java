package HackerRankPrograms;

import java.util.Scanner;

public class H1OddEven {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			sc.close();
			
			if(a%2!=0)
			{
				System.out.println("Weird");
			}
			else if(a>=2 && a<=5)
			{
				System.out.println("Not Weird");
			}
			else if(a>=6 && a<=20)
			{
				System.out.println("Weird");
			}
			else if(a>20)
			{
				System.out.println("Not weird");
			}
			else
			{
				System.out.println("Enter The Valid Number");
			}
			
			
		}
}
