package Assignment_Progs;

import java.util.ArrayList;

public class A068_JoinTwoLIsts {
public static void main(String[] args) {
	
    ArrayList<String> a1= new ArrayList<String>();
	
	a1.add("sahil");
	a1.add("mayank");
	a1.add("arun");
	a1.add("janak");
	a1.add("dixit");
	
    ArrayList<String> a2= new ArrayList<String>(a1);
	
	a2.add("java");
	a2.add("android");
	
	for(String str : a2)
	{
		System.out.println(str);
	}
}
}
