package digital;

import java.util.Scanner;

public class Sober {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int input = in.nextInt();
		int xaxis = 0;
		int yaxis = 0;

		int distance = 0;

		char ch = 'R';

		while (input > 0) {

			switch (ch) {
			case 'R':
				xaxis = xaxis + distance;
				distance = distance + 10;
				ch = 'U';
				break;

			}

			input--;
		}
	}

}
