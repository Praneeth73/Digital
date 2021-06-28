package digital;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SherlockandtheValidString {

	// Complete the isValid function below.
	static String isValid(String s) {

		boolean value = false;

		char[] arr = s.toCharArray();

		int[] freq = new int[26];

		for (int i = 0; i < s.length(); i++) {
			if ((arr[i] >= 'a' && arr[i] <= 'z')) {
				freq[arr[i] - 'a']++;
			}
		}

		int ans = 0;

		for (int i = 0; i < 26; i++) {
			if (freq[i] != 0) {
				if (ans == 0) {
					ans = freq[i];
				} else {
					if (ans != freq[i]) {
						ans = -1;
						break;
					}
				}

			}
		}

		if (ans != -1) {
			value = true;
		}

		for (int i = 0; i < s.length(); i++) {
			freq[arr[i] - 'a']--;
			int ans1 = 0;

			for (int j = 0; j < 26; j++) {
				if (freq[j] != 0) {
					if (ans1 == 0) {
						ans1 = freq[j];
					} else {
						if (freq[j] != ans1) {
							ans1 = -1;
							break;
						}
					}
				}

			}

			freq[arr[i] - 'a']++;
			System.out.println("ans1-->" + ans1);
			if (ans1 != -1) {
				value = true;
			}
		}

		System.out.println(value);

		return value ? "YES" : "NO";
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		String s = scanner.nextLine();

		String result = isValid(s);

		scanner.close();
	}

}
