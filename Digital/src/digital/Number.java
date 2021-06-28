package digital;

import java.util.Scanner;

public class Number {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] ar = new int[100];
		int k=0;
		for(int i = 9; i > 1 ;i--)
		{
			if(n%i == 0) {
				n=n/i;
				ar[k++]=i;
				//k++;
			}
			
		}
		for(int i=0;i<k ; i++) {
			System.out.println(ar[i]);
		}
	}
}
