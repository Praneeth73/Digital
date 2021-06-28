package digital;

import java.util.*;
public class CandiesJAR {

	public static void main(String[] args) {
		// 95 94 93 62 45 75 84 72 62 
		// 0  1  2  3  4  5  6  7  8  
		
		Scanner in = new Scanner(System.in);
		int[] trainees = new int [9]; 
		int[] result = new int[3];
		for(int i=0;i<9;i++) {
			int n = in.nextInt();
			trainees[i] = n;
		}
		
		for(int i = 0 ;i<3;i++) {
			int sum =0;
			for(int j=i ; j<9 ; j += 3) {
				sum =sum+trainees[i];
			}
			result[i] = sum/3;
		}
		int max = 0;
		for(int i = 0 ;i<3;i++) {
			if(result[i]>max) {
				max = result[i];
			}
		}
		
		 for(int i = 0; i < 3; i++) {
	   		 if(result[i] == max) {
	   			 System.out.println("Trainee Number : " + (i + 1));
	   		 }
	   		 if(result[i] <70) {
	   			 System.out.print("Trainee is Unfit");
	   		 }
	   	 }
		
	}

}
