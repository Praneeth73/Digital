package digital;

import java.util.Scanner;

public class SubStrings {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		String str1 = in.next();
		String str2 = in.next();
		String[] sarr = new String[10];
		String[] sarr1 = new String[10];
		int value = 0;
		int value1 = 0;

		for (int i = 0; i < str1.length(); i++) {
			for (int j = i; j < str1.length(); j++) {
				System.out.println(i+" "+j);
				String Arr = str1.substring(i, j+1);
				sarr[i] = Arr;
				value++;

			}
		}
		
		for(String x : sarr) {
			System.out.println(x);
		}

		for (int i = 0; i < str2.length(); i++) {
			for (int j = i; j < str2.length(); j++) {

				String Arr1 = str2.substring(i, j+1);
				sarr1[i] = Arr1;
				value1++;

			}
		}
		
		for(String x : sarr1) {
			System.out.println(x);
		}

		
		int result = 0;

		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				
				if(sarr[i] != null && sarr1[j] != null) {
					System.out.println(sarr[i]);
					System.out.println(sarr[j]);
					if(sarr[i].equals(sarr1[j]) )
					{
						result++;
					}
				}

			}
		}
		
		System.out.println(result);

	}

}
