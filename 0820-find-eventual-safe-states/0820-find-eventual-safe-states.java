class Solution {

    // Topological sort with reversing edges.
    public List<Integer> eventualSafeNodes(int[][] graph) {

        int n=graph.length;
        List<List<Integer>> adj=new ArrayList<List<Integer>>();
        int[] indegree=new int[n];

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int node:graph[i]){
                adj.get(node).add(i);
                indegree[i]++;
            }
        }

        Queue<Integer> queue=new LinkedList<>();

        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }
        boolean[] safe=new boolean[n]; 

        while(!queue.isEmpty()){
            int node=queue.poll();
            safe[node]=true;

            for(int neighbour: adj.get(node)){
                indegree[neighbour]--;
                if(indegree[neighbour]==0){
                    queue.add(neighbour);
                }
            }
        }

        List<Integer> safeNodes=new ArrayList<>();

        for(int i=0;i<safe.length;i++){
            if(safe[i]){
                safeNodes.add(i);
            }
        } 
        return safeNodes;
        
    }
}