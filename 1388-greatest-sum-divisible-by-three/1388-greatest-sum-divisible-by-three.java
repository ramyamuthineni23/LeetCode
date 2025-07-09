public class Solution {
    public int maxSumDivThree(int[] nums) {
        int[] dp = new int[3]; // dp[i] stores the max sum with remainder i

        for (int num : nums) {
            int[] temp = dp.clone(); // Copy current dp state to avoid overwriting
            for (int i = 0; i < 3; i++) {
                int sum = temp[i] + num;
                dp[sum % 3] = Math.max(dp[sum % 3], sum);
            }
        }

        return dp[0]; // maximum sum divisible by 3
    }
}
