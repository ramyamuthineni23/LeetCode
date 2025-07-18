class Solution {
    public int superEggDrop(int K, int N) {
        int[][] dp = new int[K + 1][N + 1];
        int m = 0; // moves

        while (dp[K][m] < N) {
            m++;
            for (int k = 1; k <= K; k++) {
                dp[k][m] = dp[k - 1][m - 1] + dp[k][m - 1] + 1;
            }
        }

        return m;
    }
}
