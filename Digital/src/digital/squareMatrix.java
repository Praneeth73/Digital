package digital;

import java.util.Scanner;

public class squareMatrix {
	
	static int diagonalMatrix(int[][] matrix,int n) {
		int count1 = 0;
		int count2 = 0;
		for(int i=0; i<n ; i++ ) {
			for(int j=0; j<n ; j++) {
				if(i == j) {
					count1 = count1+ matrix[i][j];
				}
			}
		}
		
		for(int i=0; i<n ; i++ ) {
					count2 = count2+ matrix[i][n-i-1];
				
		}
		
		int count =  Math.abs(count1-count2);
		
		return count;
	}
	
	public static void main(String args[]) {
	
		Scanner in = new Scanner(System.in);
		int n =  in.nextInt();
		
		int[][] matrix = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) { 
				matrix[i][j] = in.nextInt();
			}
		}
		
		System.out.println(diagonalMatrix(matrix,n));
		
		
	}
	
}
