class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        int l=0,sum=0;
        int maxSum=Integer.MIN_VALUE;
        double avg=0;
        int count=0;
        for(int r=0;r<nums.length;r++){
            
            sum+=nums[r];
            if(r>=k-1){
                if(sum/k>=threshold){
                    count++;
                }
                sum-=nums[l];
                l++;
            }
            
            System.out.println(r+" "+sum+" "+count);
        }
        return count;
    
    }
} 