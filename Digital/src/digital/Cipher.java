package digital;

import java.util.Scanner;

public class Cipher {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		String str = in.nextLine();
		int key = in.nextInt();
		System.out.println(CustomCasarCipher(str, key));
		

	}

	static String CustomCasarCipher(String str, int key) {
		char[] arr = str.toCharArray();
		char[] alp = { 'a', 'b', 'c','d','e','f','g','h','i','j',
				'k','l','m','n','o','p','q','r','s','t','u',
				'v','w','x','y','z'};
		
		char[] alpA= { 'A', 'B', 'C','D','E','F','G','H','I',
				'J','K','L','M','N','O','P','Q','R','S','T',
				'U','V','W','X','Y','Z'};
		char[] in= {'0','1','2','3','4','5','6','7','8','9'};

		for (int i = 0; i < str.length(); i++) {
			if(arr[i] >='a' && arr[i] <='z') {
				arr[i] = alp[((arr[i]-'a')+key)%26];
			}
			if(arr[i]>= '0' &&arr[i]<='9') {
				arr[i] = in[((arr[i]-'0')+key)%10];
			}
			if(arr[i] >='A' && arr[i] <='Z') {
				arr[i] = alpA[((arr[i]-'A')+key)%26];
			}
		}
		char a = '0';
//		System.out.println(a);
		String r =new String(arr);
		return r;
	}

}
