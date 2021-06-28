package digital;

import java.util.Scanner;

public class tcs281 {

	public static int maxProfit(int[] arr) {

		int max = 0;
		int value = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
				value = arr[j] - arr[i];
					//i = j;
				
				}
				System.out.println("i"+i+"j"+j);
				if (value > max) {
					max = value;
				}
			}
			
			
		}

		return max;
	}
//	public static int maxProfit(int[] prices)
//    {
//        int n = prices.length;
//        int cost = 0;
//        int maxCost = 0;
// 
//        if (n == 0) {
//            return 0;
//        }
// 
//        // store the first element of array in a variable
// 
//        int min_price = prices[0];
// 
//        for (int i = 0; i < n; i++) {
// 
//            // now compare first element with all the
//            // element of array and find the minimum element
// 
//            min_price = Math.min(min_price, prices[i]);
// 
//            // since min_price is smallest element of the
//            // array so subtract with every element of the
//            // array and return the maxCost
// 
//            cost = prices[i] - min_price;
// 
//            maxCost = Math.max(maxCost, cost);
//        }
//        return maxCost;
//    }

	public static void main(String[] args) {
		// stock prices on consecutive days
		int prices[] = { 100, 180, 260, 310, 40, 535, 695  };
		System.out.print(maxProfit(prices));
	}
}