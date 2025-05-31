package Strings_Questions;

import java.util.HashMap;
import java.util.Map;

public class OcuranceOfLetters {
	public static void main(String[] args) {
		String str1 = "my name is sahil";
		Map<Character, Integer> CharCountMap = new HashMap<Character, Integer>();
		
		for(char c : str1.toCharArray())
		{
			CharCountMap.put(c, CharCountMap.getOrDefault(c, 0)+ 1);
		}
		
		System.out.println("Character Count Is " + CharCountMap);
		
	}
	
}
