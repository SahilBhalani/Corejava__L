package Array;

import java.util.Scanner;

public class arrayDemo1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of array");
		int size = sc.nextInt();
		char ch[] = new char[size];
		
		for (int i = 0; i < ch.length; i++) {
			
			System.out.println("enter the index of an array : "+i);
			ch[i]=sc.next().charAt(0);
		}
		
		for (int i = 0; i < ch.length; i++) {
			
			System.out.println(ch[i]);
			
		}
		
		
		
}

	
}	
