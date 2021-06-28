package digital;

import java.util.Scanner;

public class Geologist {
	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		int[][] arr2 = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				arr2[i][j] = in.nextInt();
			}
		}
		int count=0,count1=0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > arr2[0][0] && arr[i] < arr2[0][1]) {
             count++;
			}
			if (arr[i] > arr2[1][0] && arr[i] < arr2[1][1]) {
			count1++;
			}
		}
		System.out.println(count+" "+count1);
	}

}
