class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int leftSum=0, rightSum=0;
        for(int num:nums){
            rightSum+=num;
        }
        for(int i=0;i<n;i++){
            rightSum-=nums[i];
            if(leftSum==rightSum)
                return i;
            else{
                leftSum+=nums[i];
                
            }
        }
        return -1;
    }
}