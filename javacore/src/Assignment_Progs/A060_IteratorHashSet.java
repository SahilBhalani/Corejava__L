package Assignment_Progs;

import java.util.HashSet;
import java.util.Iterator;

public class A060_IteratorHashSet {
public static void main(String[] args) {
	
HashSet<String> a1 = new HashSet<String>();
	
	a1.add("sahil");
	a1.add("mayank");
	a1.add("arun");
	a1.add("janak");
	a1.add("dixit");
	
	Iterator<String> str = a1.iterator();
	while(str.hasNext())
	{
		System.out.println(str.next());
	}
}
}
