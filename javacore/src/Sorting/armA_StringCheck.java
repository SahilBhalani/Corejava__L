package Sorting;

import java.util.Scanner;

public class armA_StringCheck {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The First String: ");
		String s = sc.nextLine();

		System.out.println("Enter The Second String: ");
		String s1 = sc.nextLine();

		char ch[] = s.toCharArray();
		char ch1[] = s1.toCharArray();

		for (int i = 0; i < ch.length; i++) {
		}

		for (int i = 0; i < ch1.length; i++) {
		}
		System.out.println();
		
		char temp;
		
		for(int i=0;i<ch.length;i++)
		{
			
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[j]<ch[i])
				{
					
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
					
					
				}
			}
			System.out.print(ch[i]);
		}
		
		System.out.println();
		
		for(int i=0;i<ch1.length;i++)
		{
			
			for(int j=i+1;j<ch1.length;j++)
			{
				if(ch1[j]<ch1[i])
				{
					
					temp = ch1[i];
					ch1[i] = ch1[j];
					ch1[j] = temp;
					
					
				}
			}
			System.out.print(ch1[i]);
			
		}
		
		int f = 0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=ch1[i])
			{
				f=1;
			}
			
		}
		
		if(f==0)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not");
		}
		
		
	}
}
