class Solution {
    HashMap<Integer, Integer> hashMap=new HashMap<>();
    int[] nums;
    public int rob(int[] nums) {
        this.nums=nums;
        return dp(nums.length-1);
    }
    public int dp(int i){
        if(i==0){
            return nums[0];
        }
        if(i==1){
            return Math.max(nums[0],nums[1]);
        }
        if(!hashMap.containsKey(i)){
            hashMap.put(i, Math.max(dp(i-1), dp(i-2)+nums[i]));
        }
        return hashMap.get(i);
    }
}