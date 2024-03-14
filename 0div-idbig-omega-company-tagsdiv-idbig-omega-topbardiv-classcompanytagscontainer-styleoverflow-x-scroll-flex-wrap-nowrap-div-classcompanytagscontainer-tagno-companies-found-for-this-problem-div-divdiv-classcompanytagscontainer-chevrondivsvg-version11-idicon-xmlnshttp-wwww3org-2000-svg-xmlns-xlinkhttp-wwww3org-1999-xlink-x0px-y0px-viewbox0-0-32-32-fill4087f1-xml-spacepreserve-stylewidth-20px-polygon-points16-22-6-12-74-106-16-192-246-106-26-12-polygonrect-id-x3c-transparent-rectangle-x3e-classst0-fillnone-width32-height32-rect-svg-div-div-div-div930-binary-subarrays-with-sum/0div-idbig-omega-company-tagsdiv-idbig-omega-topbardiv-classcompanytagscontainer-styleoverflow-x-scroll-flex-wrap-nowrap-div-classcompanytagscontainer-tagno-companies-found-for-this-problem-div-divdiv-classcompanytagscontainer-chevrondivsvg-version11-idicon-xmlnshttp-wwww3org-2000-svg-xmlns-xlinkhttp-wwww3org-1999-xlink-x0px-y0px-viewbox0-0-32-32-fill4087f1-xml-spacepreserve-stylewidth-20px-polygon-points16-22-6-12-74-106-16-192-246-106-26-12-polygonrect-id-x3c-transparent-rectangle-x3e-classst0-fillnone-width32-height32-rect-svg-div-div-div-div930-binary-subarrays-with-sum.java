class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        int curSum=0;
        int prefZero=0;
        int start=0;
        int totalCount=0;
        for(int end=0;end<nums.length;end++){
            curSum+=nums[end];
            while(start<end &&(nums[start]==0 || curSum>goal)){
                if(nums[start]==1)
                    prefZero=0;
                else
                    prefZero++;
                
                curSum-=nums[start];
                start++;
            }
            if(curSum==goal){
                totalCount+=1+prefZero;
            }
        }
        return totalCount;
    }
}