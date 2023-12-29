package Assignment_Progs;

import java.util.Scanner;

class Result
{
	double p1,p2,p3,p4,p5;
	
	public Result(double p1,double p2,double p3,double p4,double p5)
	{
		this.p1=p1;
		this.p2=p2;
		this.p3=p3;
		this.p4=p4;
		this.p5=p5;
	}
	
	public void sum()
	{
		double ad = p1 + p2 + p3 + p4 + p5;
		
		System.out.println("Sum of All Subject Marks :" + ad);
		
		double av = (p1 + p2 + p3 + p4 + p5) * 100 / 500;
		
		System.out.println("Average is "+av);
		
		if(av >= 91 && av <= 100)
		{
			System.out.println("A Grade");
		}
		else if (av >= 81 && av <= 90)
		{
			System.out.println("B Grade");
		}
		else if (av >= 71 && av <= 80)
		{
			System.out.println("B Grade");
		}
		else if (av >= 61 && av <= 70)
		{
			System.out.println("C Grade");
		}
		else if (av >= 51 && av <= 60)
		{
			System.out.println("D Grade");
		}
		else if (av >= 41 && av <= 50)
		{
			System.out.println("DD Grade");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
}

public class A034_Mark_Below {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Value Of Subject 1 :");
		double p1 = sc.nextDouble();
		
		System.out.println("Enter The Value Of Subject 2 :");
		double p2 = sc.nextDouble();
		
		System.out.println("Enter The Value Of Subject 3 :");
		double p3 = sc.nextDouble();
		
		System.out.println("Enter The Value Of Subject 4 :");
		double p4 = sc.nextDouble();
		
		System.out.println("Enter The Value Of Subject 5 :");
		double p5 = sc.nextDouble();
		
		Result r = new Result(p1,p2,p3,p4,p5);
		r.sum();
	}

}