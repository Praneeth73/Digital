package digital;

import java.util.Scanner;

public class UniqueDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a =in.nextInt();
		int b =in.nextInt();
		int count=0;
		if(a<10) {
			count++;
		}
		for(int i=a ;i<=b;i++) {
			if(i%10 != i/10) {
				count++;
			}
		}
		System.out.println(count);
	}

}
