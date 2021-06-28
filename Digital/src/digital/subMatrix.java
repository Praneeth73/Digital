 package digital;

public class subMatrix {

	static int[][] printMaxSubSquare(int[][] M) {

		int rowsSize = M.length;
		int columnSize = M[0].length;
		int[][] auxArray = new int[rowsSize][columnSize];

		for (int j = 0; j < columnSize; j++) {
			auxArray[0][j] = M[0][j];
		}

		for (int i = 0; i < columnSize; i++) {
			auxArray[i][0] = M[i][0];
		}

		for (int i = 1; i < rowsSize; i++) {
			for (int j = 1; j < columnSize; j++) {
				if (M[i][j] == 1) {

					auxArray[i][j] = Math.min(auxArray[i][j - 1], Math.min(auxArray[i - 1][j - 1], auxArray[i - 1][j]))
							+ 1;

				} else {
					auxArray[i][j] = 0;
				}
			}
		}

//		for (int i = 0; i < rowsSize; i++) {
//			for (int j = 0; j < columnSize; j++) {
//				
//				System.out.println(auxArray[i][j]);
//				
//			}
//
//		}

		// Maximum value co ordinates in auxArray
		int max = auxArray[0][0], max_i = 0, max_j = 0;

		for (int i = 0; i < rowsSize; i++) {
			for (int j = 0; j < columnSize; j++) {
				if (auxArray[i][j] > max) {
					max = auxArray[i][j];
					max_i = i;
					max_j = j;
				}
			}
		}

//		System.out.println(max_i);
//		System.out.println(max_j);

		System.out.println("Maximum in the matrix --->>>");

		for (int i = max_i; i > max_i - max; i--) {
			for (int j = max_j; j > max_j - max; j--) {
				System.out.print(M[i][j]);
			}
			System.out.println();
		}

		return null;
	}

	public static void main(String args[]) {
		int M[][] = { { 0, 1, 1, 0, 1 }, { 1, 1, 0, 1, 0 }, { 0, 1, 1, 1, 0 }, { 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1 },
				{ 0, 0, 0, 0, 0 } };

		printMaxSubSquare(M);
	}
}
