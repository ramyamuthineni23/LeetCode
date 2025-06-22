class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int size=rooms.size();
        boolean visited[] = new boolean [size];

        Queue<Integer> queue=new LinkedList<>();
        queue.add(0);
        while(!queue.isEmpty()){
            int node=queue.poll();
            visited[node]=true;

            for(int neigh:rooms.get(node)){
                if(!visited[neigh]){
                    queue.add(neigh);
                }
            }
        }

        for(boolean visit:visited){
            if(!visit)
                return false;
        }
        return true;
    }
}