package Assignment_Progs;

import java.util.ArrayList;
import java.util.HashSet;

public class A070_ConvertHashToList {
public static void main(String[] args) {
	
HashSet<String> a1 = new HashSet<String>();
	
	a1.add("sahil");
	a1.add("mayank");
	a1.add("arun");
	a1.add("janak");
	a1.add("dixit");
	
ArrayList<String> a2 = new ArrayList<String>(a1); // converting hashset to arraylist

	System.out.println(a2);
}
}
