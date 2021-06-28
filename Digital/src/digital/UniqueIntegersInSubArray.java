package digital;

import java.util.Scanner;

public class UniqueIntegersInSubArray {

	public static void main(String[] args) {
	//	5, 3, 5, 2, 3, 2
		Scanner in = new Scanner(System.in);
		//int input = in.nextInt();
		int result = 0;
		int arrsub[] =  new int[6];

		int arr[] = { 5, 3, 5, 2, 3, 2 };
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = in.nextInt();
//		}

		int value = 6;
		
		for(int i=0 ;i<arr.length;i++) {
			int count = 0;
			int j=i;
			int k=0;
			while(count < 6 && arr.length>j+3) {
				arrsub[k]=arr[j];
				k++;
				j++;
				
				System.out.println(subval(arrsub));
			}
			result = result + subval(arrsub);
		}
		System.out.println(result);
	}

	private static int subval(int[] arrsub) {
		int count = 0 ;
		for(int i=0;i<6;i++) {
			for(int j=i;j<6;j++) {
				if(arrsub[i] == arrsub[j]) {
					count++;
				}
			}
		}
		return count;
	}

}
