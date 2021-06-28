package digital;

import java.util.Scanner;

public class Bus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();

		int[] cost = { 800, 600, 750, 900, 1400, 1200, 1100, 1500 };
		String[] str = { "TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA" };
		int value = 0, value1 = 0;
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Invalid");
		} else {
			for (int i = 0; i < str.length; i++) {

				if (str1.toUpperCase().equals(str[i])) {
					value = i;
				}
				if (str2.toUpperCase().equals(str[i])) {
					value1 = i;
				}
			}
		}
		String strd = "Hello";
		int ca = 5;
		char c = 'a';
		int a = Integer.parseInt(strd);
		float total=0;		
		for(int i=0;i<=value1;i++) {
			total += cost[i];
			System.out.println(i);
		}
		for(int i=cost.length-1;i>value;i--) {
			total += cost[i];
			System.out.println(i);
		}

	System.out.println(Math.ceil((total*5)/1000));

	}

}
