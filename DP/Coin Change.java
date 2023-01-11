class Solution {
    public long count(int S[], int m, int n) {
        // code here.
        long dp[] = new long[n + 1];
        
        dp[0] = 1;
        
        for(int i = 0; i < m; i++) {
            for(int j = S[i]; j < n + 1; j++) {
                dp[j] += dp[j - S[i]];
            }
        }
        
        return dp[n];
    }
}