class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> combinations=new ArrayList<>();
        backtrack(0,target,candidates,result,combinations);
        return result;
    }
    
    public void backtrack(int index, int target, int[] nums,List<List<Integer>> result, List<Integer> combinations){
        if(target==0){
            result.add(new ArrayList<>(combinations));
            return;
        }
        for(int i=index;i<nums.length;i++){
            if (nums[i] <= target) {
                combinations.add(nums[i]);
                backtrack(i,target-nums[i],nums,result,combinations);
                combinations.remove(combinations.size()-1);
            }
        }
        return;
    }
}