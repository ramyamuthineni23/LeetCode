class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum = 0, rightSum = 0, n = nums.length;
        for(int val:nums) {
            rightSum+= val;
        }
        System.out.println("Sum:" + rightSum);
        int[] result = new int[n];

        for(int i = 0; i < n; i++){
            rightSum -= nums[i];
            result[i] = Math.abs(leftSum-rightSum);

            leftSum += nums[i];
            
        }
        return result;
    }
}