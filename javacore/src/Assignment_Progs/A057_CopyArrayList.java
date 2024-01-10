package Assignment_Progs;

import java.util.ArrayList;

public class A057_CopyArrayList {
public static void main(String[] args) {
	

	ArrayList<String> a1= new ArrayList<String>();
	
	a1.add("sahil");
	a1.add("mayank");
	a1.add("arun");
	a1.add("janak");
	a1.add("dixit");
	
	ArrayList<String> a2 = new ArrayList<String>(a1); // copying list a1 in  a2 
	
	for(String it : a1)
	{
		System.out.println(it);
	}
	
	
	
}
}
