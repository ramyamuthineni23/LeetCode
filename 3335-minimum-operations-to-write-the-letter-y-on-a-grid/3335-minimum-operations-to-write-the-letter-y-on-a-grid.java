class Solution {
    public int minimumOperationsToWriteY(int[][] grid) {
        
        int n = grid.length;

        List<int[]> yCells = new ArrayList<>();
        List<int[]> nonYCells = new ArrayList<>();
        
        int mid = n/2;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean isY = false;
                if(i < mid && (i == j || j == n - i - 1)) {
                    isY = true;
                }
                else if(i >= mid && j == mid) {
                    isY = true;
                }
                if (isY) yCells.add(new int[]{i, j});
                else nonYCells.add(new int[]{i, j});
            }
       }

        int res = Integer.MAX_VALUE;

        for (int c1 = 0; c1 < 3; c1++) {
            for (int c2 = 0; c2 < 3; c2++) {

                if (c1 == c2) continue;
                int repaint = 0;

                for (int[] cell : yCells) {
                    if (grid[cell[0]][cell[1]] != c1)    repaint++;
                }

                for (int[] cell : nonYCells) {
                    if (grid[cell[0]][cell[1]] != c2)    repaint++;
                }
                res = Math.min(res, repaint);
            }
        }
        return res;
    }
}