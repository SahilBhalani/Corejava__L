package Assignment_Progs;

import java.util.ArrayList;

public class A071_EmptySet {
public static void main(String[] args) {
	
	ArrayList<Integer> a1 = new ArrayList<Integer>();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	
	System.out.println(a1.isEmpty());
	
	ArrayList<Integer> a2 = new ArrayList<Integer>();
	
	System.out.println(a2.isEmpty());
}
}
