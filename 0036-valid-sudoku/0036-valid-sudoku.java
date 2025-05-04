class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(!check(i,j,board)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean check(int r,int c, char[][] board){
        HashSet<Integer> rowSet=new HashSet<>();
        HashSet<Integer> colSet=new HashSet<>();
        HashSet<Integer> gridSet=new HashSet<>();
        
        for(int i=0;i<9;i++){
            if(board[i][c]!='.'){
                int val=(int)board[i][c];
                if(colSet.contains(val)){
                    return false;
                }
                colSet.add(val);
            }
        }
         for(int i=0;i<9;i++){
             if(board[r][i]!='.'){
            int val=board[r][i];
            if(rowSet.contains(val)){
                return false;
            }
            rowSet.add(val);
        }}

        int rs=(r-r%3);
        int cs=(c-c%3);
         for(int i=rs;i<(rs+3);i++){
             for(int j=cs;j<(cs+3);j++){
                 
                 if(board[i][j]!='.'){
                    int val=(int)board[i][j];
                    if(gridSet.contains(val)){
                        return false;
                    }
                    gridSet.add(val);
                }
             }
         }

        return true;
    
    }
}
