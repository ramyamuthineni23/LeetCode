class Solution {
    public int[] productExceptSelf(int[] nums) {        
        int len=nums.length;
        int[] result=new int[len];
        //using the result array itself to store the prefix multiplication.
        result[0]=1;
        for(int i=1;i<len;i++){
            result[i]=result[i-1]*nums[i-1];
        }

        int rightNum=1;
        // Calculating suffix multiplication and keeping the current value only
        // Storing the result to result array
        for(int i=len-1;i>=0;i--){
            result[i] = rightNum * result[i];
            rightNum = rightNum * nums[i];
        }
        return result;
    }
}