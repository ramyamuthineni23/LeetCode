class Solution {
    public boolean find132pattern(int[] nums) {
        
        int n = nums.length;
        int thirdK = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();

        for(int i = n-1; i >= 0; i--){
            if(nums[i] < thirdK) return true;

            while(!stack.isEmpty() && nums[i] > stack.peek()){
                thirdK = stack.pop();
            } 
            stack.push(nums[i]);
        }
        return false;
    }
}