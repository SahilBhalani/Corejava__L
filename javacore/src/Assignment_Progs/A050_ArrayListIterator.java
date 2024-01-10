package Assignment_Progs;

import java.util.ArrayList;
import java.util.Iterator;

public class A050_ArrayListIterator {
public static void main(String[] args) {
	
		
	ArrayList<String> a1= new ArrayList<String>();
	
	a1.add("sahil");
	a1.add("mayank");
	a1.add("arun");
	a1.add("janak");
	a1.add("dixit");
	
	
	Iterator<String> itr = a1.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
}
}
