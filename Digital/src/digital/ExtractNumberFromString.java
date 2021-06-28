package digital;

import java.util.Scanner;

public class ExtractNumberFromString {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		String str = in.nextLine();

		boolean b = false;
		int max = 0;

		for (int i = 0; i < str.length(); i++) {
			String s = "";
			// System.out.println("str->"+str.charAt(i));
			while (str.charAt(i) <= '9' && str.charAt(i) >= '0') {
				// System.out.println(i);
				if (str.charAt(i) == '9') {
					b = true;
				}
				s = s + str.charAt(i);
				if (i == str.length() - 1) {
					break;
				}
				i++;
			}

			if (b == false && s != "") {
				// System.out.println("s-->"+s);
				int a = Integer.parseInt(s);
				if (a > max) {
					// System.out.println("a-->"+a+"Max-->"+max );
					max = a;
				}
			}
		}
		System.out.println(max);
	}

}
