package digital;

import java.util.Scanner;

//Java program to print all the permutations 
//of the given string 
public class shortPalindrome {

	// Function to print all the permutations of str
	static void printPermutn(String str, String ans) {
		if(str.length() == 0) {
			System.out.println(ans);
			return;
		}
		System.out.println("ans--->>>" +ans);
		// abc
		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			System.out.println("a-->>"+a);
			
			
			String left = str.substring(0, i);
			String right = str.substring(i + 1);
			String res = left + right;
			//ans = ans + a;
			//System.out.println("ans-->>"+ans);
			printPermutn(res, ans+a);
		}

	}

	// Driver code
	public static void main(String[] args) {
		String s = "abc";
		printPermutn(s, "");
	}
}
