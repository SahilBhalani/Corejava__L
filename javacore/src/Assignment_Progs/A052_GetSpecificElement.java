package Assignment_Progs;

import java.util.ArrayList;

public class A052_GetSpecificElement {
public static void main(String[] args) {
	
	ArrayList<String> a1= new ArrayList<String>();
	
	a1.add("sahil");
	a1.add("mayank");
	a1.add("arun");
	a1.add("janak");
	a1.add("dixit");
	
	System.out.println(a1.get(3));  // retreaving specific element
}
}
