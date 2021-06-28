package digital;

import java.util.Scanner;

public class Washmachine {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		if (n <= 7000 && n > 0) {
			if (n > 0 && n <=2000) {
				System.out.println( "25 minutes");
			}
			if (n > 2000 && n <= 4000) {
				System.out.println( "35 minutes");
			}
			if (n > 4000) {
				System.out.println( "45 minutes");
			}
		}else {
			if(n<0) {
				System.out.println( "Invalid");
			}
			if(n>0) {
				System.out.println( "OVERLOAD");
			}
		}

	}

}
