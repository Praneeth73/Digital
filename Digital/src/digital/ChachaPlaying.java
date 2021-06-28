package digital;

import java.util.Deque;

public class ChachaPlaying {

	static int[] rank(int noOfPlayers, int[] scores, int noOfGchcha, int[] chacha) {

		int[] ranks = new int[noOfPlayers];
		int[] chacharank = new int[noOfGchcha];
		int rank = 1;
		ranks[0] = 1;
		for (int i = 1; i < scores.length; i++) {

			if (scores[i - 1] <= scores[i]) {

				ranks[i] = rank;
			} else {
				rank++;
				ranks[i] = rank;
			}
		}

		for (int i = 0; i < noOfGchcha; i++) {
			for (int j = 0; j < scores.length; j++) {
				if (chacha[i] >= scores[j]) {
					chacharank[i] = ranks[j];
					break;
				} else {
					chacharank[i] = ranks[j] + 1;
				}

			}
		}
	

		return chacharank;
	}

	public static void main(String[] args) {

		int noOfPlayers = 7;
		int[] scores = { 100, 100, 50, 40, 40, 20, 10 };
		int noOfGchcha = 5;
		int[] chacha = { 4, 5, 25, 50, 120 };

		for (int c : rank(noOfPlayers, scores, noOfGchcha, chacha)) {
			System.out.println(c);
		}

	}

}
