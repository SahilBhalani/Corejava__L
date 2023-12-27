package Collection;

import java.util.LinkedHashSet;

public class C001_LInkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		
		set.add("manki");
		set.add("janki");
		set.add("arni");
		set.add("sahli");
		
		for(String i : set)
		{
			System.out.println(i);
		}
	}
}
