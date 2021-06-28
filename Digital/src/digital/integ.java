package digital;
import java.util.*;
public class integ {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count=1;
		int num=n;
		
		while(num>0) {
			count = count * num%10;
			num = num/10;
		}
		System.out.println(count);
	}

}
