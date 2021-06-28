package digital;

import java.util.Scanner;

public class reverseStrings {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		String str = in.next();
		int n = in.nextInt();
		String c = in.next();
		int z = n;
		int p = n;
		// faceperp 3 eperpfac

		char[] result = new char[str.length()];

		int k = 0;
		if (c.equalsIgnoreCase("L")) {
			while (n > 0) {
				result[str.length() - n] = str.charAt(k);
				n--;
				k++;
			}

			for (int i = 0; i < str.length() - p; i++) {
				result[i] = str.charAt(i + z);

			}

			for (char m : result) {
				System.out.println(m);
			}
		}
		if (c.equalsIgnoreCase("R")) {

			while (n > 0) {
				result[str.length() - n] = str.charAt(k);
				n--;
				k++;
			}

			for (int i = 0; i < str.length() - p; i++) {
				result[i] = str.charAt(i + z);

			}

			for (char m : result) {
				System.out.println(m);
			}
		}
	}

}
