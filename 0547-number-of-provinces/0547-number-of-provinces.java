class Solution {
    int[] visited;
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        visited=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
                if(visited[i]==0){
                    dfs(isConnected,i,n);
                    count++;
                }
            }
        
        return count;
    }
    public void dfs(int[][] isConnected, int node, int n){
        
        visited[node]=1;
        
        for(int j=0;j<n;j++){
            if(isConnected[node][j]==1 && visited[j]==0){
                dfs(isConnected,j,n);
            }
        }
        
        return;
    }
}