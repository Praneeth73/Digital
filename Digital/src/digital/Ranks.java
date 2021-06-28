package digital;

import java.util.Arrays;
import java.util.Scanner;

public class Ranks {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		float ranks[] = new float[100];
		float f[] = new float[100];

		for (int i = 0; i < f.length; i++) {
			String c = in.next();
			if (c.equalsIgnoreCase("q")) {
				break;
			}
			f[i] = Float.parseFloat(c);
		}
		Arrays.sort(f);
		for (int i = 0; i < f.length; i++) {
			if (f[i] < 0) {
				System.out.println("Invaild values");
			}
		}
		//5 4 8 6 8 2
		float max = 0;
		int count = 0;
		int j = 0;
		 for (int i=0; i<f.length-1; i++){  
	            if (f[i] != f[i+1]){  
	                ranks[j] = f[i]; 
	                j++;
	            }  
	         }  
	        ranks[j++] = f[f.length-1];     
	        // Changing original array 
	        Arrays.sort(ranks);
	        
		for (int i = f.length-2; i >f.length- 5; i--) {
			System.out.println(ranks[i]);
		}
	}
}
