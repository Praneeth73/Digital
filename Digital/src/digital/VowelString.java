package digital;

import java.util.Scanner;

public class VowelString {
	public static void main(String args[]) {
	Scanner in  =  new Scanner(System.in);
	String  a =  in.nextLine();
	String b = in.nextLine();
	String c = in.nextLine();
	
	char[] arr = a.toCharArray();
	char[] brr = a.toCharArray();
	
	for (int i=0; i < a.length();i++) {
		if(a.charAt(i)== 'a' ||a.charAt(i)== 'e'||a.charAt(i)== 'i'||a.charAt(i)== 'o'||a.charAt(i)== 'u') {
			arr[i] = '*';
		}
	}
	for (int i=0; i < b.length();i++) {
		if(b.charAt(i) != 'a' && b.charAt(i)!= 'e' && b.charAt(i)!= 'i' && b.charAt(i)!= 'o'&&b.charAt(i)!= 'u') {
			brr[i] = '@';
		}
	}
	String crr = c.toUpperCase();
	String x = new String(arr);
	String y = new String(brr);
	String s= x+y+crr;
	System.out.println(s);
}
}
