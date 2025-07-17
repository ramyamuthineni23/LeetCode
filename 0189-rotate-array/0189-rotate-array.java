class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length; 
        if (k == 0) {
            return;
        }

        swap(nums, 0, nums.length - 1);
        swap(nums, 0, k-1);
        swap(nums, k, nums.length - 1);
    }

    public void swap(int[] nums, int i, int j) {
        int swap;
        while (i <= j) {
            swap = nums[j];
            nums[j] = nums[i];
            nums[i] = swap;
            i++;
            j--;
        }
    }
}