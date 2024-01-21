class Solution {
    HashMap<Integer,Integer> hash=new HashMap<>();
    int[] nums;
    public int rob(int[] nums) {
        this.nums=nums;
        return dp(nums.length-1);
    }
    int dp(int i){
        if(i==0){
            return nums[0];
        }
        if(i==1){
            return Math.max(nums[0],nums[1]);
        }
        if(!hash.containsKey(i))
            hash.put(i,Math.max(dp(i-2)+nums[i], dp(i-1)));
        
        return hash.get(i);
    }
}