class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;

        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        int left = 0;
        int right = 0;

        for(int i=0; i<n; i++) {
            left += nums[i];
            leftSum[i]=left;
        }
        for(int i=n-1; i>=0; i--) {
            right += nums[i];
            rightSum[i]=right;
        }
        int[] result = new int[n];
         for(int i = 0; i<n; i++) {
            result[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return result;
    }
}