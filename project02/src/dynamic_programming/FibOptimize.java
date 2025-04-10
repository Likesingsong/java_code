package dynamic_programming;

import java.util.Arrays;

public class FibOptimize {

	public static void main(String[] args) {
		int n = 3;
		int[] dp = new int[n+1];
		System.out.println(fib(n, dp));
        System.out.println(Arrays.toString(dp));
	}

	public static int fib(int n, int[] dp) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (dp[n] != 0) {
			return dp[n];
		}		
		int fnm1 = fib(n-1, dp);
		int fnm2 = fib(n-2, dp);
		int fn = fnm1 + fnm2;
        dp[n] = fn;
		return fn;
	}
}