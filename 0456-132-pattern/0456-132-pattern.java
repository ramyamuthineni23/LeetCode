class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<int[]> stack=new Stack<>();
        int curr_min=nums[0];

        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            while(!stack.isEmpty() && n>=stack.peek()[0])
                stack.pop();
            if(!stack.isEmpty() && n>stack.peek()[1])
                return true;
            stack.push(new int[]{n,curr_min});
            curr_min=Math.min(n,curr_min);
        }
        return false;
    }
}