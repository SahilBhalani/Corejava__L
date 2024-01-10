package Assignment_Progs;

import java.util.ArrayList;
import java.util.Collections;

public class A073_Compare {
public static void main(String[] args) {
	
	ArrayList<Integer> a1 = new ArrayList<Integer>();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	
	System.out.println(a1); 
	
	Collections.swap(a1, 2, 1);
	
	System.out.println(a1);
}
}
