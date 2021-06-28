package digital;

import java.util.Scanner;

public class ChainMarket {

	public static void main(String args[]) {
		
		Scanner in =  new Scanner(System.in);
		
		String parent = in.next();
		String value = in.next();
		String childs = in.next();
		if(value == "N") {
			System.out.println("TOTAL MEMBERS:1");
			System.out.println("COMISSION DETAILS\\n");
			System.out.println(parent+"250 INR");
		}
		if(value.equalsIgnoreCase("Y")) {
			
			String[] chilesArr = childs.split(",");
			System.out.println("TOTAL MEMBERS:" + (chilesArr.length+1));
			System.out.println("COMISSION DETAILS\\n");
			System.out.println(parent+"500 INR");
			for(int i=0;i<chilesArr.length;i++) {
				System.out.println(chilesArr[i] + ": 20INR");
			}
		}
				
		
		
	}
	
}
