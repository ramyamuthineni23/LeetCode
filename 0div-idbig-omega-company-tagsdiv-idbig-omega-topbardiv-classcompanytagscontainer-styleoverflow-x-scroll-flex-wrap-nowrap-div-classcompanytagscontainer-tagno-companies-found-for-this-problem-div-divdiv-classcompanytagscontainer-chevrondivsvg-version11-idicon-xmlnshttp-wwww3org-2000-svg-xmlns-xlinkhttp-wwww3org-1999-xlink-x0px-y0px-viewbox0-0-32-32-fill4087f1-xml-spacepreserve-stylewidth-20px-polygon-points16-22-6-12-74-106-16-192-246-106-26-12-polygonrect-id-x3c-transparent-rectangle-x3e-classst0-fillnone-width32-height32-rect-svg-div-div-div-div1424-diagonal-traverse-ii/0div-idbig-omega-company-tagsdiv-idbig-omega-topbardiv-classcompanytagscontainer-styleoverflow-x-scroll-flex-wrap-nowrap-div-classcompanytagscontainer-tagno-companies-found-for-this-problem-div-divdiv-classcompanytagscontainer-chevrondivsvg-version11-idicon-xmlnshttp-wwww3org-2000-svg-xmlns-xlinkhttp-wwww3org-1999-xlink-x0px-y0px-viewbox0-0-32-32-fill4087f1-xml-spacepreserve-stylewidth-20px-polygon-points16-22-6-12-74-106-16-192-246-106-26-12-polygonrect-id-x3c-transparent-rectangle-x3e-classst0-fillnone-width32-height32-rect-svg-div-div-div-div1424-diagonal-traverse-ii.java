class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        Queue< Pair<Integer, Integer>> queue=new LinkedList<>();
        queue.add(new Pair(0,0));
        List<Integer> result = new ArrayList();
        int k=0;
        while(!queue.isEmpty()){
            Pair<Integer, Integer> p=queue.remove();
            int row=p.getKey();
            int col=p.getValue();
            result.add(nums.get(row).get(col));
            
            if(col==0 && row+1<nums.size()){
                queue.add(new Pair(row+1,col));
            }
            
            if(col+1<nums.get(row).size()){
                queue.add(new Pair(row,col+1));
            }
        }
         int[] res = new int[result.size()];
        int i = 0;
        for (int num : result) {
            res[i] = num;
            i++;
        }
        
        return res;
    }
    
}