package digital;

import java.util.Scanner;

public class Oxygen {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		int[] arr = new int[9];
		for(int i=0;i<9;i++) {
			int n = in.nextInt();
			arr[i] = n ;
		}
		int k=0;
		int[] avgs = new int[3];
 		
		int j=0;
		for(int i=0;i<9;i += 3) {
			int avg = 0;
			int count=0;
			int z=i;
			while(count<3) {
				//System.out.println("z--->"+z);
				if(arr[z] > 0 && arr[z] <100 ) {
					avg = avg + arr[z];
				}
				z++;
				count++;
			}
			avg = avg/3;
			System.out.println(avg);
			avgs[k] = avg;
			k++;
		}
		int max=0;
		for(int i=0;i<3;i++) {
			if(avgs[i]>max) {
				max=avgs[i];
			}
			
		}
		for(int i=0;i<3;i++) {
			if(avgs[i] == max) {
				System.out.println("Tranintee--->"+(i+1));
			}
			if(avgs[i] < 70) {
				System.out.println("Unfit--->" +i+1);
			}
		}
	}
}
