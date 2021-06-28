package digital;

public class Knapsack {
    // A utility function that returns maximum of two integers 
    static int max(int a, int b) { return (a > b) ? a : b; } 
	
	public static int knapSack(int W, int[] wt, int[] val,int  n) {
		
		if(W==0 || n==0) {
			return 0;
		}
		
		return  max(val[n-1]+knapSack(W-wt[n-1],wt,val,n-1),knapSack(W, wt, val, n - 1)) ;
		
	}

	public static void main(String args[]) {
		int W = 50;
	    int val[] = new int[] { 60, 100, 120 }; 
        int wt[] = new int[] { 10, 20, 30 }; 
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n)); 
	}

	
}
