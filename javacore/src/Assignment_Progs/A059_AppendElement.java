package Assignment_Progs;

import java.util.LinkedHashSet;

public class A059_AppendElement {
public static void main(String[] args) {
	
	
LinkedHashSet<String> a1 = new LinkedHashSet<String>();
	
	a1.add("sahil");
	a1.add("mayank");
	a1.add("arun");
	a1.add("janak");
	a1.add("dixit");

	System.out.println(a1);
	
	a1.add("nitya"); // appending a element
	
	System.out.println(a1);
}
}