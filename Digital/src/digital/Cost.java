package digital;

import java.util.Scanner;

public class Cost {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n =in.nextInt();
		int m=in.nextInt();
		
		float[] inter = new float[n];
		float[] exter = new float[m];
 		
		for(int i=0;i<n;i++) {
			inter[i] = in.nextFloat();
		}
		for(int j=0;j<m;j++) {
			exter[j] = in.nextFloat();
		}
		
		float val = 0,val1=0;
		for(int i=0;i<n;i++) {
			val += inter[i]*18;
		}
		for(int j=0;j<m;j++) {
			val1 += exter[j]*12;
		}
		System.out.println(val+val1);
	}
}
