public class Solution {
    public int RemoveDuplicates(int[] nums) {
        if(nums.Length<=1)
            return nums.Length;
        if(nums.Length==2){
            if(nums[0]==nums[1])
                return 1;
            return 2; 
        }
        int index=0;
        for(int i=0;i<nums.Length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[index++]=nums[i];

            }
        }

        nums[index++]=nums[nums.Length-1];
        return index;
    }
}