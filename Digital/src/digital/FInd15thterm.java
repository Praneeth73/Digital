package digital;

import java.util.Scanner;

public class FInd15thterm {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int num1 = 0;
		int num2 = 0;
		int[] arr = new int[n+1];
		int val = 2;
		for (int i = 2; i <= n; i++) {
			if (i % 2 == 0) {
				arr[val] = num1 += 7;
				val++;
			} else {
				arr[val] = num2 += 6;
				val++;
			}
		}

		System.out.println(arr[n]);

	}

}
