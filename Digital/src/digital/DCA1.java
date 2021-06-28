package digital;

import java.util.*;

public class DCA1 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int input = in.nextInt();

		String[] arr = new String[input];
		
	
		int Digits = 0;
		int Words = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.next();
		}
		for (int i = 0; i < input; i++) {
			boolean value  = false;
			boolean value1 = false;
			char[] charr = arr[i].toCharArray();
			for (int j = 0; j < charr.length; j++) {
			
				//System.out.print(charr[j]);

				if(charr[j] >= 'a' && charr[j] <='z' || charr[j] >= 'A' && charr[j] <= 'Z') {
					value =true;
				}
				if(charr[j] > '0' && charr[j] <'9' ) {
					
					value1 = true;
				}
			}
			
			if(value == true && value1 == false) {
				Words++;
			}
			if(value1 == true && value == false) {
				Digits++;
			}
			if(value1 == true && value == true) {
				System.out.println("Invalid Input");
			}
		}
		System.out.println(Digits);
		System.out.println(Words);
	}
}
