package Assignment_Progs;

import java.util.ArrayList;
import java.util.Scanner;

public class A074_PrintAllElement {
public static void main(String[] args) {
	
	ArrayList<Integer> a1 = new ArrayList<Integer>();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	
	System.out.println("Total Element In ArrayList Is : "+a1.size());
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter The INdex NUM to Show The Output :");
	int index = sc.nextInt();
	
	System.out.println(a1.get(index));
	
}
}
