class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum=0;
        long sum=0;
        int first=0;
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i=0;i<nums.length;i++){
                
                while (first < i && (hashSet.contains(nums[i]) || hashSet.size() >= k)) {
                    hashSet.remove(nums[first]);
                    sum-=nums[first++];
                }
                sum+=nums[i];
                hashSet.add(nums[i]);
                
            
            if(hashSet.size()==k){
                    maxSum=Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }
}