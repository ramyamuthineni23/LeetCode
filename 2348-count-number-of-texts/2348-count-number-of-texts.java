class Solution {
    public int countTexts(String A) {
        int M = (int)(1e9 + 7);
        int[] ways = new int[]{0, 0, 3, 3, 3, 3, 3, 4, 3, 4}; // num of letters for each index
        int[] dp = new int[A.length()];
        long ans = 1;
        for (int i = 0; i < A.length(); i++){
            for (int j = 1; j <= ways[A.charAt(i) - '0']; j++){
                if (i - j < 0 || A.charAt(i) != A.charAt(i - j)){ // base case
                    dp[i]++;
                    break;
                }
                dp[i] = (dp[i] + dp[i - j]) % M;
            }
            if (i == A.length() - 1 || A.charAt(i) != A.charAt(i + 1)){
                ans = (ans * dp[i]) % M; // multiply them together
            }
        }
        return (int)ans;
    }
}