package Assignment_Progs;


import java.util.LinkedHashSet;

public class A069_Converting {
public static void main(String[] args) {
	
	LinkedHashSet<Integer> a1 = new LinkedHashSet<Integer>();
	
	a1.add(10);
	a1.add(20);
	a1.add(30);
	a1.add(40);
	a1.add(50);
	
	Integer i[] = new Integer[5];
	a1.toArray(i);
	for(Integer str : i)
	{
		System.out.println(str);
	}
}
}
