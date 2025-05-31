package Strings_Questions;

import java.util.Arrays;

public class Anagram_Check {

	public static void main(String[] args) {
		String str1 = "mom";
		String str2 = "mom";
		Boolean isAnagram = checkAnagram(str1,str2);
		System.out.println("Are Anagram? "+ isAnagram);
	}

	private static Boolean checkAnagram(String str1, String str2) {
		// TODO Auto-generated method stub
		if(str1.length() != str2.length()) {
			return false;
		}
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		
		return Arrays.equals(arr1, arr2);
	}
}
