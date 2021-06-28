package digital;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaximumMarks {
//	
//	4 // number of questions
//	10 // Total time to attend the test
//	1 2 // one mark question – 2 seconds to solve.
//	2 3 // two mark question – 3 seconds to solve.
//	3 5 // three mark question – 5 seconds to solve.
//	4 7 // 4 mark question – 7 seconds to solve.

	static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	static int maxMarks(int totalTime, int[] marks, int[] time, int noOfQ) {

		if (noOfQ == 0 || totalTime == 0) {
			return 0;
		}

		if (time[noOfQ - 1] > totalTime) {
			return maxMarks(totalTime, marks, time, noOfQ - 1);

		}

		int value = max(marks[noOfQ - 1] + maxMarks(totalTime - time[noOfQ - 1], marks, time, noOfQ - 1),
				maxMarks(totalTime, marks, time, noOfQ - 1));
//		int value = max(marks[noOfQ - 1] + maxMarks(totalTime - time[noOfQ - 1], marks, time, noOfQ - 1),
//				maxMarks(totalTime, marks, time, noOfQ - 1));

		return value;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int no0fQ = 4;
		int totalTime = 10;

		int[] marks = { 1, 2, 3, 4 };
		int[] time = { 2, 3, 5, 17 };

		System.out.println(maxMarks(totalTime, marks, time, no0fQ));
	}
}
