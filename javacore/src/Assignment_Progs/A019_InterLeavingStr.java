package Assignment_Progs;

public class A019_InterLeavingStr {

		    // Method to find all interleavings of two strings
		    public static void interleave(String str1, String str2, String interleaved, int i, int j) {
		        // Base case: if both strings are exhausted, print the interleaved result
		        if (i == str1.length() && j == str2.length()) {
		            System.out.println(interleaved);
		            return;
		        }

		        // If characters remain in str1, include the next character and recurse
		        if (i < str1.length()) {
		            interleave(str1, str2, interleaved + str1.charAt(i), i + 1, j);
		        }

		        // If characters remain in str2, include the next character and recurse
		        if (j < str2.length()) {
		            interleave(str1, str2, interleaved + str2.charAt(j), i, j + 1);
		        }
		    }

		    public static void main(String[] args) {
		        String str1 = "AB";
		        String str2 = "CD";
		        
		        System.out.println("All interleavings of " + str1 + " and " + str2 + ":");
		        interleave(str1, str2, "", 0, 0);
		    }
		}

		
	
