class Solution {
    // Function to find the length of longest common subsequence in two strings.
    /*
     * static int lcs(int x, int y, String s1, String s2) {
     * // your code here
     * 
     * int dp[][] = new int[x + 1][y + 1];
     * 
     * for (int i = 0; i <= x; i++) {
     * dp[i][0] = 0;
     * }
     * 
     * for (int i = 0; i <= y; i++) {
     * dp[0][i] = 0;
     * }
     * 
     * for (int i = 1; i <= x; i++) {
     * for (int j = 1; j <= y; j++) {
     * dp[i][j] = -1;
     * }
     * }
     * 
     * // for(int i = 0; i <= x; i++) {
     * // for(int j = 0; j <= y; j++) {
     * // System.out.print(dp[i][j] + " ");
     * // }
     * // System.out.println();
     * // }
     * 
     * return lcsUtil(x, y, s1, s2, dp);
     * }
     * 
     * static int lcsUtil(int x, int y, String s1, String s2, int dp[][]) {
     * 
     * if (x == 0 || y == 0)
     * return 0;
     * 
     * if (dp[x][y] != -1)
     * return dp[x][y];
     * 
     * if (s1.charAt(x - 1) == s2.charAt(y - 1)) {
     * dp[x][y] = 1 + lcsUtil(x - 1, y - 1, s1, s2, dp);
     * return dp[x][y];
     * } else
     * return dp[x][y] = Math.max(lcsUtil(x, y - 1, s1, s2, dp), lcsUtil(x - 1, y,
     * s1, s2, dp));
     * 
     * }
     */

    // Another Apporach

    static int lcs(int x, int y, String s1, String s2) {
        // your code here

        int dp[][] = new int[x + 1][y + 1];

        return lcsUtil(x, y, s1, s2, dp);

    }

    static int lcsUtil(int x, int y, String s1, String s2, int dp[][]) {

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[x][y];
    }

}