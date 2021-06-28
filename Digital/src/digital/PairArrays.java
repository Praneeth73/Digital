package digital;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class PairArrays {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int sizeArray = in.nextInt();
		int k = in.nextInt();

		int[] a = new int[sizeArray];

		for (int i = 0; i < sizeArray; i++) {
			a[i] = in.nextInt();
		}

		int count = 0;

//		for(int i=0;i<sizeArray;i++) {
//			for(int j=i+1;j<sizeArray;j++) {
//				if((arr[i]-arr[j]  == targetValue || arr[j]-arr[i] == targetValue)) {
//					count++;
//				}
//			}
//		}

		// Using hashset
		
		  int arrr[] = {1,5,6,3,2,8};
	      Arrays.sort(arrr);
	      Collections.reverseOrder();
	      for(int i: arrr){
	        System.out.println(i);
	      }
		
		HashSet<Integer> il = new HashSet<Integer>();
		il.add(a[0]);

		for (int i = 1; i < a.length; i++) {
			int num = a[i];
			if (il.contains(num + k)) {
				System.out.println(num + " " + (num + k));
				count++;
			}
			if (il.contains(num - k)) {
				System.out.println(num + " " + (num - k));
				count++;
			}
			il.add(a[i]);
		}

		System.out.println(count);
	}

}
