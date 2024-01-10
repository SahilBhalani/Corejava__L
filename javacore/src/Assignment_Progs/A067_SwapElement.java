package Assignment_Progs;

import java.util.ArrayList;
import java.util.Collections;

public class A067_SwapElement {
public static void main(String[] args) {
	
 ArrayList<String> a1= new ArrayList<String>();
	
	a1.add("sahil");
	a1.add("mayank");
	a1.add("arun");
	a1.add("janak");
	a1.add("dixit");
	
	System.out.println(a1);
	
	Collections.swap(a1, 0, 2); // swapped 2 at 0.
	
	System.out.println(a1);
	
	
}
}
