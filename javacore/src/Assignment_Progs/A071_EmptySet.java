package Assignment_Progs;
import java.util.HashMap;

public class A071_EmptySet {
public static void main(String[] args) {
	
	HashMap<String , Integer> a1 = new HashMap<String,Integer>();
	a1.put("sahil", 20);
	a1.put("arun", 20);
	
	System.out.println(a1.isEmpty());
	
	HashMap<String , Integer> a12 = new HashMap<String,Integer>();
	
	System.out.println(a12.isEmpty());
}
}
