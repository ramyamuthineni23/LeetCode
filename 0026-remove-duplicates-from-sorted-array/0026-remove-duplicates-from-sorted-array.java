class Solution {
    public int removeDuplicates(int[] nums) {
        
        int n=nums.length;
        int prev=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=nums[prev]){
                nums[++prev]=nums[i];
            }
            
        }
        return prev+1;
    }
}