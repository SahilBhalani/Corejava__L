package Assignment_Progs;

import java.util.ArrayList;

public class A049_ArrayList {
public static void main(String[] args) {
	
	
	ArrayList<String> a1= new ArrayList<String>();
	
	a1.add("red");
	a1.add("ourange");
	a1.add("yellow");
	a1.add("black");
	a1.add("white");
	
	for(String str : a1)
	{
		System.out.println(str);
	}
}
}
