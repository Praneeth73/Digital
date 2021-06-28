
package digital;

import java.util.*;

public class Series2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int num = 2;
		if (n % 2 == 1) {
			for (int i = 2 ; i < n/2; i +=2) {

					num = num * 2;
				
			}
			System.out.println(num);
		}else{
			for (int i = 2; i < n/2; i+=2) {
					num = num + 1;	
				
		}
			System.out.println(num);
			}
	}
}
