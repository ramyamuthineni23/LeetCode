class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0,sum=0;
        int maxSum=Integer.MIN_VALUE;
        double avg=0;
        for(int r=0;r<nums.length;r++){
            
            sum+=nums[r];
            if(r>=k-1){
                maxSum=Math.max(sum,maxSum);;
                sum-=nums[l];
                l++;
            }
        }
        return (double)maxSum/k;
    }
}