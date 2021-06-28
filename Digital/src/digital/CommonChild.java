package digital;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CommonChild {

	// Complete the commonChild function below.
	static int commonChild(String s1, String s2) {

		int[][] auxArr = new int[s1.length() + 1][s2.length() + 1];
		
		 for (int i = 0; i < s1.length(); i++) {
			 auxArr[i][0] = 0;
         }

         for (int i = 0; i < s2.length(); i++) {
        	 auxArr[0][i] = 0;
         }
		
		for (int i = 1; i <=s1.length(); i++) {
			for (int j = 1; j <=s2.length(); j++) {
//				if (i == 0 || j == 0) {
//					auxArr[i][j] = 0;
//				} else {
					if (s1.charAt(i-1) == s2.charAt(j-1)) {
						auxArr[i][j] = auxArr[i - 1][j - 1] + 1;
					} else {
						auxArr[i][j] = Math.max(auxArr[i][j - 1], auxArr[i - 1][j]);
					}
				}
			
		}
		for (int i = 1; i <=s1.length(); i++) {
			for (int j = 1; j <= s2.length(); j++) {
				System.out.print(" "+auxArr[i][j]);
			}
System.out.println();
		}

		System.out.println(auxArr[s1.length() - 1][s2.length() - 1]);

		return auxArr[s1.length() - 1][s2.length() - 1];
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String s1 = scanner.nextLine();

		String s2 = scanner.nextLine();

		int result = commonChild(s1, s2);

		scanner.close();
	}
}
