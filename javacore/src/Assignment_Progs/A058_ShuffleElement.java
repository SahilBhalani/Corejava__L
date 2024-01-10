package Assignment_Progs;

import java.util.ArrayList;
import java.util.Collections;

public class A058_ShuffleElement {
public static void main(String[] args) {
	

	ArrayList<String> a1= new ArrayList<String>();
	
	a1.add("sahil");
	a1.add("mayank");
	a1.add("arun");
	a1.add("janak");
	a1.add("dixit");
	
	Collections.shuffle(a1); // shuffling all elements
	
	for(String str : a1)
	{
		System.out.println(str);
	}
}
}
