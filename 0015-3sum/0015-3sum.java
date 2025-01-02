class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n && nums[i]<=0;i++){
            if(i==0 || nums[i]!=nums[i-1]){
                checkSum(nums, i, result);
            }
        }
        return result;
    }
    public void checkSum(int[] nums, int i, List<List<Integer>> result){
        int low=i+1, high=nums.length-1;

        while(low<high){
            int sum=nums[i]+nums[low]+nums[high];
            if(sum<0){
                low++;
            }
            else if(sum>0){
                high--;
            }
            else{
                result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                low++;
                high--;
                while(low<high && nums[low]==nums[low-1]) low++;
            }
        }
    }
}