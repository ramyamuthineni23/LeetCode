class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        
        Queue<String> q=new LinkedList<>();
        q.add(startGene);
        HashSet<String>visited=new HashSet<>();
        int steps=0;
        visited.add(startGene);
        while(!q.isEmpty()){
            int nodesLength=q.size();
            for(int j=0;j<nodesLength;j++){
               
                String node=q.remove();
                if(node.equals(endGene)){
                    return steps;
                }
                for(char ch:new char[]{'A','C','G','T'}){
                    for(int i=0;i<node.length();i++){
                        String neighbor=node.substring(0,i)+ch+node.substring(i+1);
                        if(!visited.contains(neighbor) && Arrays.asList(bank).contains(neighbor)){
                            visited.add(neighbor);
                            q.add(neighbor);
                        }
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}