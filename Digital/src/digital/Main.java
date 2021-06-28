package digital;

import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char[] arr = str.toCharArray();
		boolean a = true;
		Deque<Character> stac = new ArrayDeque<Character>();
		for (int i = 0; i < str.length(); i++) {
			if (arr[i] == '{' || arr[i] == '(' || arr[i] == '[') {
				stac.push(arr[i]);
				continue;
			}
			if (stac.isEmpty()) {
				System.out.println("NotBalanced");
				break;
			}
			char check;
			switch (arr[i]) {
			case ')':
				check = stac.pop();
				if (check == '{' || check == '[') {
					a = false;
				}
				break;
			case '}':
				check = stac.pop();
				if (check == '(' || check == '[') {
					a = false;
				}
				break;
			case ']':
				check = stac.pop();
				if (check == '{' || check == '(') {
					a=false;

				}
				break;
			}

		}
		if (a) {
			System.out.println("Balanced");
		} else {
			System.out.println("NotBalanced");
		}
	}
}