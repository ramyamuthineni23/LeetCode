class Solution {
    public int[][] specialGrid(int N) {
        if (N == 0) {
            return new int[][]{{0}};
        }

        int[][] prev = specialGrid(N - 1);
        int size = prev.length;
        int newSize = size * 2;
        int[][] result = new int[newSize][newSize];
        int offset = size * size;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = prev[i][j] + 3 * offset;               // Top-left
                result[i][j + size] = prev[i][j];                     // Top-right
                result[i + size][j] = prev[i][j] + 2 * offset;        // Bottom-left
                result[i + size][j + size] = prev[i][j] + offset;     // Bottom-right
            }
        }

        return result;
    }
}