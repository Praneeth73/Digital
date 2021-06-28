package digital;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n >= 30) {
			char a ='5'-'0';
			int c = (int )a;
			char b = '6'-'0';
			int d = (int)b;
			int e = c*d;
			System.out.println("--->>>"+ e);
			System.out.println("Invalid");
		}
		
		char a ='5';
		char b = '6';
		System.out.println(a*b);

		int num = 1;
		int num2 = 1;
		for (int i = 2; i < n; i++) {
			if (i % 2 == 0) {
				num = num * 2;
			}
			if (i % 2 == 1) {
				num2 = num2 * 3;
			}
		}
		if (n % 2 == 0) {
			System.out.println(num2);
		} else {
			System.out.println(num);
		}
	}

}
