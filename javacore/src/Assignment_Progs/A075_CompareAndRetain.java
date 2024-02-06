package Assignment_Progs;

import java.util.HashSet;

public class A075_CompareAndRetain {

	 public static void main(String[] args) {
	        // Create two sets
	        HashSet<Integer> set1 = new HashSet<>();

	        set1.add(1);
	        set1.add(2);
	        set1.add(3);

	        HashSet<Integer> set2 = new HashSet<>();
	        set2.add(2);
	        set2.add(3);
	        set2.add(4);

	        HashSet<Integer> El = new HashSet<>(set1);
	        El.retainAll(set2);

	        
	        System.out.println("Common Elements: " + El);
	    }
}
