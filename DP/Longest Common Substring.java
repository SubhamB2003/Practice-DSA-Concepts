class Solution {
    int longestCommonSubstr(String S1, String S2, int n, int m) {
        // code here
        int lcs[][] = new int[n + 1][m + 1];
        int x = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) {
                    lcs[i][j] = 0;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (S1.charAt(i - 1) == S2.charAt(j - 1)) {
                    lcs[i][j] = 1 + lcs[i - 1][j - 1];
                } else {
                    lcs[i][j] = 0;
                }
                x = Math.max(lcs[i][j], x);
            }
        }

        return x;
    }
}