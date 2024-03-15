class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> permutations=new ArrayList<>();
        backtrack(0,nums,result,permutations);
        return result;
    }
    
    public void backtrack(int index, int[] nums,List<List<Integer>> result, List<Integer> permutations){
        if(permutations.size()==nums.length){
            result.add(new ArrayList<>(permutations));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!permutations.contains(nums[i])){
                permutations.add(nums[i]);
                backtrack(i,nums,result,permutations);
                permutations.remove(permutations.size()-1);
            }
        }
        return;
    }
}