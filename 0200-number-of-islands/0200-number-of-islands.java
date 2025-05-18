class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
       for(int i=0;i<grid.length;i++) {
            for(int j=0; j<grid[i].length;j++) {
                if(grid[i][j] == '1' ) {
                    getVisitedArray(i, j, grid);
                    ++count;
                }
            }
        }
        return count;
    }

   private void getVisitedArray(int i, int j, char[][] grid) {
        if(grid[i][j]=='1') {
            grid[i][j] = 'V';
            if(i+1 < grid.length) {
                getVisitedArray(i + 1, j, grid);
            }
            if(j+1 < grid[i].length) {
                getVisitedArray(i, j+1, grid);
            }

            if(i-1 >= 0) {
                getVisitedArray(i - 1, j, grid);
            }

            if(j-1 >= 0) {
                getVisitedArray(i , j-1, grid);
            }
        }
    }
        }
        