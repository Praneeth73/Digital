package digital;

import java.util.Scanner;

public class replacingMinimumNumberOfCharacters {

	public static void main(String[] args) {

		String[] arr = { "west", "east", "wait" };
//
		char[][] charArr = new char[arr.length][arr[1].length()];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				charArr[i][j] = arr[i].charAt(j);
			}
		}

		int cntMinOP = 0;

		// Stores length of the string
		int M = arr[0].length();

		// hash[i][j]: Stores frequency of character
		// i present at j-th index of all strings
		int hash[][] = new int[256][M];

		// Initialize hash[][] to 0
		// Traverse the array arr[]
		for (int i = 0; i < arr.length; i++) {

			// Iterate over characters of
			// current string
			for (int j = 0; j < 4; j++) {

				// Update frequency of
				// arr[i][j]
				System.out.println(charArr[i][j] + "---VALUE--->>>" + (int) charArr[i][j]);
				hash[charArr[i][j]][j]++;
			}
		}
		for (int i = 0; i < 256; i++) {
			System.out.println();
			for (int j = 0; j < arr[0].length(); j++) {
				System.out.print(hash[i][j]);
			}
		}

		// Traverse hash[][] array
		for (int i = 0; i < M; i++) {

			// Stores sum of i-th column
			int Sum = 0;

			// Stores the largest element
			// of i-th column
			int Max = 0;

			// Iterate over all possible
			// characters
			for (int j = 0; j < 256; j++) {

				// Update Sum
				Sum = Sum + hash[j][i];
				// System.out.println();

				// Update Max
				Max = Math.max(Max, hash[j][i]);
			}
			System.out.println("SUM--->>>" + Sum);
			System.out.println("MAX--->>>" + Max);
			// Update cntMinOP
			cntMinOP += (Sum - Max);
		}
		System.out.println(cntMinOP);
	}

}
