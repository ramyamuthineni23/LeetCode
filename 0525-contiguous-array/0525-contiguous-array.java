class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // Important: sum 0 at index -1
        int maxLength = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            // Convert 0 to -1
            sum += nums[i] == 0 ? -1 : 1;

            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum, i); // Store the first index of this sum
            }
        }

        return maxLength;
    }
}