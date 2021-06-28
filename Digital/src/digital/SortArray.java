package digital;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	//3 5 1 9 2 6 7 8
	//35489
	
	static int[] sortedArray(int[] arr) {
		
		int[] sort1 = new int[arr.length];
		int count;
		
		for(int i= 0 ;i< arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				count = 0;
				if(arr[i]>arr[j]) {
					count = arr[i];
					arr[i] = arr[j];
					arr[j] = count;
				}
			}
			
		}
		//Arrays.sort(arr);
		return arr;
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int[] arr = new int[x];
		for (int i = 0; i < x; i++) {
			arr[i] = in.nextInt();
		}
		for(int i : sortedArray(arr)) {
		System.out.print(i);
		}
	}
}
