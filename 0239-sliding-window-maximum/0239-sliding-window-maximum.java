import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // Deque to store indices of useful elements in current window
        // It maintains a decreasing order of values in nums
        Deque<Integer> dq = new ArrayDeque<>();

        // Result list to store max values for each window
        List<Integer> res = new ArrayList<>();

        // Step 1: Process the first k elements separately to initialize the deque
        for (int i = 0; i < k; i++) {
            // Remove elements from the back of deque if current element is greater
            // These elements cannot be max in any future window
            while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
                dq.pollLast();
            }

            // Add current index to deque
            dq.offerLast(i);
        }

        // Add the maximum of the first window (front of deque)
        res.add(nums[dq.peekFirst()]);

        // Step 2: Process the rest of the elements (i = k to nums.length - 1)
        for (int i = k; i < nums.length; i++) {
            // Remove indices from front if they are out of the current window
            // (i - k is the index that just moved out of the window)
            if (dq.peekFirst() == i - k) {
                dq.pollFirst();
            }

            // Remove elements from the back of deque that are less than current
            // They will never be needed as current element is greater and more recent
            while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
                dq.pollLast();
            }

            // Add current index to the deque
            dq.offerLast(i);

            // The max of current window is at the front of deque
            res.add(nums[dq.peekFirst()]);
        }

        // Convert the result list to an int array and return it
        return res.stream().mapToInt(i -> i).toArray();
    }
}
