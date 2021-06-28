package digital;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CharArray {

	// Complete the encryption function below.
	static String encryption(String s) {

		String a = s.replace("\\s", "");
		int len = a.length();
		String str = "";
		double sqt = (Math.sqrt(len));

		int flr = (int) (Math.floor(sqt));
		int cil = (int) (Math.ceil(sqt));

		if (flr * cil < len) {
			if (flr > cil) {

				cil = flr;
			} else {
				flr = cil;
			}
		}
		System.out.println(flr);
		System.out.println(cil);

		char arr[][] = new char[flr][cil];
		System.out.println("value"+arr[1][1]);
		int count = 0;
		for (int i = 0; i < flr; i++) {
			for (int j = 0; j < cil; j++) {
				if (count < len) {
					arr[i][j] = a.charAt(count);
					count++;
				}
			}
		}

		for (int i = 0; i < cil; i++) {
			for (int j = 0; j < flr; j++) {
				if (arr[j][i] == 0) {
					System.out.println("helloa");
					str = str;
				}else {
					str = str + arr[j][i];
				}
			}
			str = str + " ";
		}
		return str;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		String result = encryption(s);
		System.out.println(result);

		scanner.close();
	}
}
