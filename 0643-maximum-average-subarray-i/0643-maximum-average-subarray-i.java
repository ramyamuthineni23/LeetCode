class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg=Integer.MIN_VALUE;
        double avg=Integer.MIN_VALUE;
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            if(i<k)
                sum+=nums[i];
            else{
                avg=((double)sum/(double)k);
                maxAvg=Math.max(avg,maxAvg);
                sum=sum+nums[i]-nums[i-k];
            }
        }
        avg=((double)sum/(double)k);
        maxAvg=Math.max(avg,maxAvg);
        return maxAvg;
    }
}