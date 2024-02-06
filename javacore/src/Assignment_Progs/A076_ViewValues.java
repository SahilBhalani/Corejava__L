package Assignment_Progs;
import java.util.HashMap;
import java.util.Map.Entry;

public class A076_ViewValues {

	 public static void main(String[] args) {
	      
	        HashMap<String, Integer> hashMap = new HashMap<>();

	       
	        hashMap.put("One", 1);
	        hashMap.put("Two", 2);
	        hashMap.put("Three", 3);

	        for(Entry<String, Integer> m : hashMap.entrySet())
	    	{
	    		System.out.println(m.getKey()+" "+m.getValue());
	    	}
	        
	        

	}
}


	  
