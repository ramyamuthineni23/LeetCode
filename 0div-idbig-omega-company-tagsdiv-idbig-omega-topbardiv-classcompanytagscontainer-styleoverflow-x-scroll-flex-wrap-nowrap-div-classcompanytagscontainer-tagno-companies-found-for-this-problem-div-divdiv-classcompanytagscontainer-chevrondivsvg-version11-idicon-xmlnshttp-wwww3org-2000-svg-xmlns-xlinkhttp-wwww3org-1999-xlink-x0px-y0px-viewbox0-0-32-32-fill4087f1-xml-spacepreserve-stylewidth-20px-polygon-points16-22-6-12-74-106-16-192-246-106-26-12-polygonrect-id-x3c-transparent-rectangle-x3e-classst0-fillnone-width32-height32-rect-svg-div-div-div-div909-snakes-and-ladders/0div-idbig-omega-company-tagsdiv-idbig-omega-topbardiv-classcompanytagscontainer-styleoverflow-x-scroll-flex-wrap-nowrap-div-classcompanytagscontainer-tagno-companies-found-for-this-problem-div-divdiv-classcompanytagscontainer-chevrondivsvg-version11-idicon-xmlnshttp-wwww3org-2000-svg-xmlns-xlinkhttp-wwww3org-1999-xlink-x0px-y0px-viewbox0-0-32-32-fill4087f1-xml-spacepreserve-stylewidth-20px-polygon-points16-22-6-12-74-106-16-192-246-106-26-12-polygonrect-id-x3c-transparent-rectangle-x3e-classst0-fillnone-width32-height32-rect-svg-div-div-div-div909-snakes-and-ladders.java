class Solution {
    
    public int snakesAndLadders(int[][] board) {
        int n=board.length;
        Pair<Integer,Integer>[] cells=new Pair[n*n+1];
        
        Integer[] columns=new Integer[n];
        for(int i=0;i<n;i++){
            columns[i]=i;
        }
        int label=1;
        for(int row=n-1;row>=0;row--){
            for(int column:columns){
                cells[label++]=new Pair<>(row,column);
            }
            Collections.reverse(Arrays.asList(columns));
        }
        
        int[] dist=new int[n*n+1];
        Arrays.fill(dist,-1);
        Queue<Integer> queue= new LinkedList<>();
        queue.add(1);
        dist[1]=0;
        while(!queue.isEmpty()){
            int cur=queue.remove();
            for(int next=cur+1;next<=Math.min(cur+6,n*n);next++){
                int row=cells[next].getKey();
                int col=cells[next].getValue();
                int destination = board[row][col]!=-1?board[row][col]:next;
                
                if(dist[destination]==-1){
                    dist[destination]=dist[cur]+1;
                    queue.add(destination);
                }
            }
        }
        return dist[n*n];
    }
}