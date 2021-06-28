package digital;

import java.util.*;

public class tcs282 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		int[] arr = new int[input];
		for (int i = 0; i < input; i++) {
			arr[i] = in.nextInt();
		}
		int max = 0;
		for (int i = 0; i < input; i++) {
			int j = i;
			int count = 0;
			while ((j < input-1) && (arr[j + 1] > arr[j])) {
				count = count + arr[j];
				j++;
				System.out.println("j"+j);
			}
			count = count+arr[j];
			System.out.println(count);
			i = j;
			if (count > max) {
				max = count;
			}
		}
		System.out.println(max);
	}
}
