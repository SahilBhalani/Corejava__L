package Assignment_Progs;

import java.util.ArrayList;
import java.util.ListIterator;

public class A064_ReverseElement {
public static void main(String[] args) {
	
    ArrayList<String> a1= new ArrayList<String>();
	
	a1.add("sahil");
	a1.add("mayank");
	a1.add("arun");
	a1.add("janak");
	a1.add("dixit");
	
	ListIterator<String> itr = a1.listIterator(a1.size());
	while(itr.hasPrevious())
	{
		System.out.println(itr.previous());
	}
}
}
