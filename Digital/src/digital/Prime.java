package digital;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Prime {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int count1 = 0; 
		Set<Integer> s = new HashSet<Integer>();
		int[] arr = new int[20];
		int val=0;
		while(a<b) {
			int count = 0;
			//System.out.println(a);
			for (int j = 1; j<= a; j++) {
				if (a % j == 0) {
					count++;
				}
			}
			//System.out.println("Count-->>"+count);
			if (count == 2) {
				arr[val] = a;
				s.add(a);
				val++;
			}
			a++;
		}
		System.out.println(s);
		for (int i : s) {
			System.out.println("i-->"+i);
			if (s.contains(i + 6)) {
				count1++;
			}
			System.out.println(count1);
		}
//		int count3=0;
//		for (int i = 0; i < 20; i++) {
//			for(int j= 0; j<20 ;j++) {
//				if(arr[i]-arr[j] == 6) {
//					count3++;
//				}
//			}
//		}
		
//		System.out.println(count3);
	}
}
