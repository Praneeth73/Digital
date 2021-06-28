package digital;

import java.util.Scanner;

class Solution {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		while (n > 0) {
			String str = in.nextLine();
			String[] strArray = new String[5];
			int k = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
					strArray[k] = "";
					strArray[k] = strArray[k] + str.charAt(i);
					System.out.println(strArray[k]);
					i++;
					if (i < str.length()) {
						while (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
							strArray[k] = strArray[k] + str.charAt(i);
							i++;

							if (i == str.length()) {
								break;
							}
						}
					}
				}
				
			}
			long max=0;
			
			for (int i=0;i<k;i++) {
				if(strArray[i].contains("9") ) {
					continue;
				}else {
					Long a = Long.parseLong(strArray[i]);
					if(a>max)
					{
						max=a;
						
					}
				}
			}
		}
		n--;

	}
}