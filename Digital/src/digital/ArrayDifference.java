package digital;

import java.util.Scanner;

public class ArrayDifference {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int d = in.nextInt();

		int count = 0;

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (arr[i] - arr[j] == d) {
					count++;
				}
			}
		}

		System.out.println(count);

	}

}
