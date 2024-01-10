package Assignment_Progs;
import java.util.ArrayList;
import java.util.Collections;

public class A056_Sort {
public static void main(String[] args) {
	
	
	ArrayList<Integer> a1 = new ArrayList<Integer>();
	
	a1.add(10);
	a1.add(50);
	a1.add(30);
	a1.add(60);
	a1.add(90);
	
	Collections.sort(a1);
	
	for(int a : a1)
	{
		System.out.println(a);
	}
}
}
