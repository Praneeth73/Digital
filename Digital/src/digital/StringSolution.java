package digital;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StringSolution {

	// Complete the commonChild function below.
	static int commonChild(String s1, String s2) {
		String[] one = new String[20];
		String[] two = new String[20];

		int count = 0;
		for (int i = 0; i <= s2.length(); i++) {
			for (int j = i + 1; j <= s2.length(); j++) {
				one[i] = s1.substring(i, j);
				System.out.println(one[i]);
			}
		}
		for (int i = 0; i <= s1.length(); i++) {
			for (int j = i + 1; j <= s1.length(); j++) {
				two[i] = s2.substring(i, j);
				System.out.println(two[i]);

			}
		}

		for (int i = 0; i <= s1.length(); i++) {
			if(one[i] == two[i] && one[i] != null) {
				if(count<one[i].length()) {
					count = one[i].length();
				}
				
			}
		}
		
		System.out.println(count);

		return count;
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
