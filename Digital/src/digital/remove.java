package digital;

import java.util.*;

public class remove {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		String inputStrin =in.nextLine();
		String inputString= inputStrin.toUpperCase();
		char[] arr = new char[inputString.length()];
		int count = 0;
		for(int i=0; i<inputString.length();i++) {
			if(inputString.charAt(i) >='a' && inputString.charAt(i) <= 'z' || inputString.charAt(i) >= 'A' && inputString.charAt(i) <= 'Z') {
				
				arr[count] = inputString.charAt(i);
				count++;
				
			}
		}
		String s = new String(arr);
		System.out.println(s);
		
	}
}
