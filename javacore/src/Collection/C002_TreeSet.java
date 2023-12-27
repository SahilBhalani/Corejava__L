package Collection;

import java.util.TreeSet;

public class C002_TreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> Tr = new TreeSet<String>();
		Tr.add("lamborghini");
		Tr.add("ferrari");
		Tr.add("bmw");
		Tr.add("Audi");
		
		for(String i  : Tr)
		{
			System.out.println(i);
		}
	}
}
