package digital;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class repeatAlpha {

	public static void main(String args[]) {

		String str = "Hello";

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		
		System.out.println(map);

	}

}
