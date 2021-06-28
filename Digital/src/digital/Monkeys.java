package digital;

import java.util.Scanner;

public class Monkeys {
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		int monkeys = in.nextInt();
		int eatableBananas = in.nextInt();
		int eatablePeanuts = in.nextInt();
		int bananas = in.nextInt();
		int peanuts = in.nextInt();
		
		int sum =0;
		
		if(monkeys < 0 && eatableBananas<0 || eatablePeanuts < 0 || bananas < 0 || peanuts < 0 ) {
			System.out.println("INVALID");
		}else {
			if(eatableBananas>0 && bananas>0) {
				sum = bananas/eatableBananas;
			}
			if(eatablePeanuts>0 && peanuts>0) {
				sum =sum +  peanuts/eatablePeanuts;
			}
			
			monkeys = monkeys-sum;
			
			System.out.println(monkeys);
		}
		
	}
}
