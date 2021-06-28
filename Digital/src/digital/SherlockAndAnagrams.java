package digital;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SherlockAndAnagrams {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		int[] result = new int[t];
		int var = 0;
		while (t != 0) {
			String str = in.next();
			result[var] = Anagram(str);
			var++;
			t--;
		}
		

	}
		
	static int Anagram(String str) {
		int value = 0 ;
		String[] sr = new String[10];
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int len = str.length();
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				char[] arr = str.substring(i, j+1).toCharArray();
				
				Arrays.sort(arr);
				String s = new String(arr);
				System.out.println("s--->>>"+s);
				if (map.containsKey(s)) {
					map.put(s, map.get(s) + 1);
				} else {
					map.put(s, 1);
				}

			}
		}
		Thread t1  = new Thread(new Runnable() {
			// Thread is a single abstract method Functional Interface.
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		
		for(String x : map.keySet() ) {
			System.out.println(x+"--->>>"+map.get(x));
			int c= map.get(x);
			 value = value+((c)*(c-1))/2;
		}
		System.out.println(value);
		
		return value;
	}
}
