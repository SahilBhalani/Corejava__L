package Assignment_Progs;

import java.util.HashSet;

public class A061_HashSetGet {
public static void main(String[] args) {
	
	HashSet<String> a1 = new HashSet<String>();
	
	a1.add("sahil");
	a1.add("mayank");
	a1.add("arun");
	a1.add("janak");
	a1.add("dixit");
	
	int count=0;
	for(int i=0;i<=a1.size()-1;i++)
	{
		count++;
	}
	
	System.out.println("The Size Of An Element Is : "+count);
}
}
