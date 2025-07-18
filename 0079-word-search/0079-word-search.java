class Solution {
    private char[][] board;
    private int ROWS;
    private int COLS;

    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.ROWS = board.length;
        this.COLS = board[0].length;

        for (int row = 0; row < this.ROWS; ++row) for (
            int col = 0;
            col < this.COLS;
            ++col
        ) if (this.backtrack(row, col, word, 0)) return true;
        return false;
    }

    protected boolean backtrack(int row, int col, String word, int index) {
        /* Step 1). check the bottom case. */
        if (index >= word.length()) return true;

        /* Step 2). Check the boundaries. */
        if (
            row < 0 ||
            row == this.ROWS ||
            col < 0 ||
            col == this.COLS ||
            this.board[row][col] != word.charAt(index)
        ) return false;

        /* Step 3). explore the neighbors in DFS */
        // mark the path before the next exploration
        this.board[row][col] = '#';

        int[] rowOffsets = { 0, 1, 0, -1 };
        int[] colOffsets = { 1, 0, -1, 0 };
        for (int d = 0; d < 4; ++d) {
            if (
                this.backtrack(
                        row + rowOffsets[d],
                        col + colOffsets[d],
                        word,
                        index + 1
                    )
            ) // return without cleanup
            return true;
        }

        /* Step 4). clean up and return the result. */
        this.board[row][col] = word.charAt(index);
        return false;
    }
}