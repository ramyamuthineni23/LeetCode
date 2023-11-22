class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited=new boolean[isConnected.length];
        int count=0;
        for(int i=0;i<isConnected.length;i++){
                if(!visited[i]){
                    dfs(i,visited,isConnected);
                    count++;
                }
        }
        return count;
    }
    public void dfs(int i,boolean[] visited, int[][] isConnected){
        
        for(int j=0;j<isConnected.length;j++){
            visited[i]=true;
            if(isConnected[i][j]==1&&!visited[j])
            dfs(j,visited,isConnected);
        }
    }
}
    