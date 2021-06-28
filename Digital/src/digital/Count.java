package digital;

import java.util.Scanner;

public class Count {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		long input = in.nextLong();
		
		long count1 = 0,count2 = 0;
		long num=input;
		int  n = 2;
		
		while(num>0) {
			if( n%2 == 0) {
			count1 = count1 + (num%10);
			num=num/10;
			n++;}else {
				count2 = count2 + (num%10);
				num=num/10;
				n++;
			}
		}
		System.out.println(Math.abs(count2-count1));
	}
}
