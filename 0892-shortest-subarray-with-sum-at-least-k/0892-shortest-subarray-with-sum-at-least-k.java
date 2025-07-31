class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        
        // Step 1: Compute prefix sum
        long[] prefix = new long[n + 1]; // Use long to avoid overflow
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        // Step 2: Use a deque to store indices of prefix sums
        Deque<Integer> deque = new ArrayDeque<>();
        int minLength = n + 1;

        for (int i = 0; i <= n; i++) {
            // Check if any subarray [deque.peekFirst()..i] has sum >= k
            while (!deque.isEmpty() && prefix[i] - prefix[deque.peekFirst()] >= k) {
                minLength = Math.min(minLength, i - deque.pollFirst());
            }

            // Maintain increasing order of prefix sums in the deque
            while (!deque.isEmpty() && prefix[i] <= prefix[deque.peekLast()]) {
                deque.pollLast();
            }

            deque.addLast(i);
        }

        return minLength <= n ? minLength : -1;
    }
}
