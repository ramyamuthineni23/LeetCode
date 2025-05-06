class Solution {
    public int[] buildArray(int[] nums) {
        int[] resultArray=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            resultArray[i]=nums[nums[i]];
        }
        return resultArray;

    }
}