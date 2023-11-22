class Solution {
    public int countNicePairs(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]-reverse(nums[i]);
        }
        int count=0;
        int MOD = (int) 1e9 + 7;
        Map<Integer, Integer> dic = new HashMap();
        for (int num : nums) {
            count = (count + dic.getOrDefault(num, 0)) % MOD;
            dic.put(num, dic.getOrDefault(num, 0) + 1);
        }
        return count%(1000000007);
    }
    public int reverse(int num){
        int rev=0;
        while(num>0){
            rev=num%10+rev*10;
            num=num/10;
        }
        return rev;
    }
}