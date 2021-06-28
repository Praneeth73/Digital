package digital;

import java.util.Arrays;
import java.util.Scanner;

public class tcs1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int input=0; 
		String str="";
		float[] arr =  new float[20];
		while(!str.equalsIgnoreCase("q")) {
			String n =in.next();
			if(n.equalsIgnoreCase("q")) {
				break;
			}	
			arr[input] = Float.parseFloat(n);
			input++;
		}
		Arrays.sort(arr);	
		float max=arr[arr.length-1];
		int count=0;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]< 0) {
				System.out.println("invalid");
				break;
			}else {
				if(arr[i]<max && arr[i] != 42.195 && count <3) {
					System.out.println(arr[i]);
					max=arr[i];
					count++;
				}
			}
		}
	}

}
