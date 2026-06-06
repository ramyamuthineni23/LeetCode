class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum = 0, rightSum = 0, n = nums.length;
        for(int val:nums) {
            rightSum+= val;
        }
        int[] result = new int[n];

        for(int i = 0; i < n; i++){
            int val = nums[i];
            rightSum -= val;
            result[i] = Math.abs(leftSum-rightSum);

            leftSum += val;
            
        }
        return result;
    }
}