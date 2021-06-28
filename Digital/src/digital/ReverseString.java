package digital;

import java.util.Scanner;

public class ReverseString {
	
	
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		reverse(input);
		//System.out.println(reverse(input));
		
	}

	private static String reverse(String input) {
		// TODO Auto-generated method stub
		System.out.println("INPUT--->>>"+input);
		String[] arr = input.split(" ");
		for(int i=0 ; i < arr.length ; i++) {
			//System.out.print(" "+arr[i]);
			String x  = arr[i];
			char[] chararr = x.toCharArray();
			for(int z= chararr.length -1; z>=0;z--) {
				System.out.print(chararr[z]);
			}
			System.out.print(" ");
		}
		
		return null;
	}

}
