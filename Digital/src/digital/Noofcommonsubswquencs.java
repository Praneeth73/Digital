package digital;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Noofcommonsubswquencs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		String m = "";
		String n= "";
		HashSet<String> x = permut(str1, m);
		HashSet<String> y = permut(str2, n);
		int count =0;
		System.out.println(x);
		System.out.println(y);
		for(String k  : x) {
			if(y.contains(k)) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	static HashSet<String> hashStr = new HashSet<String>();
	
	static HashSet<String> permut(String str1, String s) {
		
		if(str1.length() == 0) {
			hashStr.add(s);
		}
		
		for (int i = 0; i < str1.length(); i++) {
			
			char ch = str1.charAt(i);
			String left = str1.substring(0,i);
			String right = str1.substring(i+1);
			String al = left+right;
			permut(al,s+ch);
			
		}
		return hashStr;
	}

}
