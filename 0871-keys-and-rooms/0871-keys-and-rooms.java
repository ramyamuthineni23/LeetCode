class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n= rooms.size();
        boolean[] visited=new boolean[n];
        Queue<Integer> queue=new LinkedList<>();
        visited[0]=true;
        queue.add(0);

        while(!queue.isEmpty()){
            int curr=queue.remove();
            List<Integer> adj=rooms.get(curr);
            for(int adjRoom:adj){
                if(!visited[adjRoom]){
                    queue.add(adjRoom);
                    visited[adjRoom]=true;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(!visited[i])
            return false;
        }
        return true;
    }
}