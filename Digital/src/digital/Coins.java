package digital;

import java.util.Scanner;

public class Coins {
	
	public static void main(String args[]) {
		//Scanner in = new Scanner(System.in);
		//int value = in.nextInt();
		System.out.println(count(18));
	}

	public static int  count(int value) {
		 int count = 0;
		 int one = 0;
		 int two = 0;
		 int five = value/5;
		 if (value%5 !=0) {
			 int value2 = value%5;
			 two = value2/2;
			 one = value2%2;
		 }
		 System.out.println(five);
		 System.out.println(two);
		 System.out.println(one);
		return 0;
	}
}
