package Assignment_Progs;

import java.util.HashMap;
import java.util.Map.Entry;


public class A062_HashMap {
public static void main(String[] args) {
	
	HashMap<Integer,String> map = new HashMap<Integer, String>();
	
	map.put(10, "sahil");
	map.put(20, "Janak");
	map.put(30, "manki");
	map.put(40, "arun");
	
	
	for(Entry<Integer, String> m : map.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
	
}
}
