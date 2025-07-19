class Solution {
    private final int[] dx = {2, 1, -1, -2, -2, -1, 1, 2};
    private final int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

    public double knightProbability(int n, int k, int row, int column) {
        double[][][] dp = new double[k + 1][n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                dp[0][i][j] = 1;

        for (int moves = 1; moves <= k; moves++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    double prob = 0;
                    for (int d = 0; d < 8; d++) {
                        int ni = i + dx[d], nj = j + dy[d];
                        if (ni >= 0 && ni < n && nj >= 0 && nj < n)
                            prob += dp[moves - 1][ni][nj] / 8.0;
                    }
                    dp[moves][i][j] = prob;
                }
            }
        }

        return dp[k][row][column];
    }
}
