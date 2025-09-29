class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {

            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;
            while(left < right) {

                int curSum = nums[i] + nums[left] + nums[right];

                if(curSum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while(left < right && nums[left] == nums[left - 1]) left++;
                    while(right > left && nums[right] == nums[right + 1]) right--;
                } 
                else if(curSum < 0) {
                    left++;
                }
                else {
                    right--;
                }
                
            }
        }
        return result;
    }
}