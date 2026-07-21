class Solution {

    public int numSquares(int n) {

        int m = (int) Math.sqrt(n);
        int dp[][] = new int[n + 1][m + 1];

        // Base cases
        for (int i = 1; i <= n; i++) {
            dp[i][0] = Integer.MAX_VALUE;
        }

        for (int j = 0; j <= m; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                int take = Integer.MAX_VALUE;

                if (j * j <= i) {
                    int res = dp[i - j * j][j];
                    if (res != Integer.MAX_VALUE) {
                        take = 1 + res;
                    }
                }

                int skip = dp[i][j - 1];

                dp[i][j] = Math.min(take, skip);
            }
        }

        return dp[n][m];
    }
}