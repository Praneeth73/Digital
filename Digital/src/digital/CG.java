package digital;

import java.util.*;

class CG {

// Function to print the
// unique sub-String of length n
	static void result(String s, int n) {
		// set to store the Strings
		HashSet<String> st = new HashSet<String>();

		for (int i = 0; i < (int) s.length(); i++) {
			String ans = "";
			for (int j = i; j < (int) s.length(); j++) {
				ans += s.charAt(j);

				// if the size of the String
				// is equal to 1 then insert
				if (ans.length() == n) {

					// inserting unique
					// sub-String of length L
					st.add(ans);

					break;
				}
			}
		}
		int max = 0;
		for (String str : st) {
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (str.charAt(i) == '1') {
					count++;
				}
			}
			if (count > max) {
				max = count;
			}
		}
		System.out.println(max);
	}

// Driver Code
	public static void main(String[] args) {
		String s = "0001110101";
		int n = 3;

		// Function calling
		result(s, n);
	}
}