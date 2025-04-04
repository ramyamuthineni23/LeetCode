class Solution {
    public long maximumTripletValue(int[] nums) {
        long res=0, imax=0,dmax=0;
        int n=nums.length;

        for(int k=0;k<n;k++){
            res=Math.max(res,dmax*nums[k]);
            dmax=Math.max(dmax,imax-nums[k]);
            imax=Math.max(imax,nums[k]);
        }
        return res;
    }
}