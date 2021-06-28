package digital;

import java.io.*;
import java.util.*;

public class CandidateCode {

	static List<String> list = new ArrayList<>();

	private static void findsubsequences(String s, String ans) {
		if (s.length() == 0) {
			list.add(ans);
			return;
		}
		findsubsequences(s.substring(1), ans + s.charAt(0));

		findsubsequences(s.substring(1), ans);
	}

	public static String outValue(List<String> ls, String s2) {
		// System.out.println(ls);
		String val = null;
//	 ls.stream()
//     .forEach(
//             pair -> {
//                 if (pair.equals(s2)) {
//                     val = "POSITIVE";
//                 } else {
//                    val = "NEGATIVE";
//                 }
//             }
//     );
		for (String i : ls) {
			if (i.equals(s2)) {
				return "POSITVE";
			}
		}
		return "NEGITIVE";

	}

	public static void main(String args[]) throws Exception {

		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		// Scanner in = new Scanner(System.in);
		String input = bufferReader.readLine();
		int inputNum = Integer.parseInt(bufferReader.readLine());
		;
		String[] arr = new String[inputNum];
		for (int i = 0; i < inputNum; i++) {
			arr[i] = bufferReader.readLine();
			;
		}
		findsubsequences(input, "");

		String[] ans = new String[inputNum];
		for (int i = 0; i < inputNum; i++) {
			System.out.println(outValue(list, arr[i]));
		}

	}
}