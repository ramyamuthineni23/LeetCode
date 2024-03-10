class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, ArrayList<Integer>> hash=new HashMap<>();
        int[] indegree=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            hash.put(i,new ArrayList<Integer>());
        }
        for(int i=0;i<prerequisites.length;i++){
            ArrayList<Integer> temp1=hash.get(prerequisites[i][1]);                                 temp1.add(prerequisites[i][0]);
            hash.put(prerequisites[i][1],temp1);
            indegree[prerequisites[i][0]]++;
        }
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0)
                queue.add(i);
        }
        int noOfVisited=0;
        while(!queue.isEmpty()){
            int temp=queue.remove();
            noOfVisited++;
            for(int neighbor:hash.get(temp)){
                indegree[neighbor]--;
                if(indegree[neighbor]==0){
                    queue.add(neighbor);
                }
            }
        }
        return noOfVisited==numCourses;
    }
}