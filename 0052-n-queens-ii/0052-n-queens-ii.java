
class Solution {
    int size;
    int result=0;
    public int totalNQueens(int n) {
        
        size=n;
        char[][] state=new char[size][size];
        for(int i=0;i<size;i++){
            Arrays.fill(state[i],'.');
        }

        backtrack(0,new HashSet<Integer>(), new HashSet<Integer>(), new HashSet<Integer>(), state);
        return result;
    }



    public void backtrack(int row, HashSet<Integer> cols,HashSet<Integer> diagnols,HashSet<Integer> antiDiagnols,char[][] state){

        if(row==size){
            result++;
            return;
        }

        for(int col=0;col<size;col++){
            int diagnol=row-col;
            int antiDiagnol=row+col;
            if(cols.contains(col) || diagnols.contains(diagnol) || antiDiagnols.contains(antiDiagnol)){
                continue;
            }

            cols.add(col);
            diagnols.add(diagnol);
            antiDiagnols.add(antiDiagnol);

            state[row][col]='Q';
            backtrack(row+1,cols,diagnols,antiDiagnols,state);

            cols.remove(col);
            diagnols.remove(diagnol);
            antiDiagnols.remove(antiDiagnol);

            state[row][col]='.';

        }
        return;

    }
}