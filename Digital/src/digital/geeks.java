package digital;

public class geeks {
	public static void main(String[] args) {
		String name ="Hello world";
		char[] arr1 = name.toCharArray();
		String[] str = name.split(" ");
		for(int i=0;i<name.length();i++) {
		System.out.println(arr1[i]);
		}
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
			}
		
		String[] arr = { "west", "east", "wait" };
		
		char[][] charArr = new char[arr.length][arr[1].length()];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				charArr[i][j] = arr[i].charAt(j);
			}
		}
		
		int[][] hash = new int[256][arr[0].length()];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[1].length(); j++) {
				
			hash[charArr[i][j]][j]++;
			}
		}
		
		int count = 0;
		
		for (int i = 0; i < 4; i++) {
			
			int sum = 0;
			int max = 0;
			
			for (int j = 0; j < 256; j++) {
				
				sum = sum+hash[j][i];
				
				max = Math.max(max, hash[j][i]);
				
			}
			
			count  = count + (sum-max);
			
		}
		System.out.println(count);
		
	}

}
