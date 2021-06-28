package digital;

import java.util.Arrays;
import java.util.Scanner;

class ads {
	// 1,3,9,7:
	static int value(int[] arr, int n) {

		int avg = 0, sum = 0;
		int[] b = new int[n];

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		avg = sum / arr.length;
		//System.out.println(avg);

		b[0] = 0;
		for(int i=0;i<b.length-1;i++) {
			b[i+1] = arr[i] + b[i]-avg;
		}
		Arrays.sort(b);
		int median = -(b[n/2]);
		int value =0;
		for(int i=0;i<b.length;i++) {
			value = value + Math.abs(b[i]+median);
		}
		
		return value;
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		System.out.println(value(arr, n));

	}
}