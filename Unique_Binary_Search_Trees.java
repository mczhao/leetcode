public class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i=2; i<=n; i++) {
            int total = 0;
            for (int j=0; j<i; j++) total+=dp[j]*dp[i-j-1];
            dp[i] = total;
        }
        return dp[n];
    }
}