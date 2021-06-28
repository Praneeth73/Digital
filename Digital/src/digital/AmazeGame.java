package digital;

import java.util.Arrays;
import java.util.Scanner;

public class AmazeGame {
	static int max(int a, int b) {
		return (a > b) ? a : b;
	}
	
	static int min(int a, int b) {
		return (a < b) ? a : b;
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int value = in.nextInt();
		
		int[][] maze = new int[value][value];
		
		int[][] minMatrixArray = new int[value][value];

		for (int i = 0; i < value; i++) {
			for (int j = 0; j < value; j++) { 
				maze[i][j] = in.nextInt();
			}
		}
		
		//Arrays.fill(minMatrixArray, 0);
		minMatrixArray[0][0] = maze[0][0];
		for (int j = 1; j < value; j++) {
			minMatrixArray[0][j] = max(maze[0][j],minMatrixArray[0][j-1]);
		}
		
		for (int i = 1; i < value; i++) {
			minMatrixArray[i][0] = max(maze[i][0],minMatrixArray[i-1][0]);
		}
		
		for (int i = 1; i < value; i++) {
			for (int j = 1; j < value; j++) {
				minMatrixArray[i][j] = max(maze[i][j],min(minMatrixArray[i][j-1],minMatrixArray[i-1][j]));
			}
			
		}
		
		System.out.println("value--->>>" + minMatrixArray[value-1][value-1]);
	}

}





















