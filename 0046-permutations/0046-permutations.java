class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        recPermute(0,nums,ans);
        return ans;
    }
    
    public void recPermute(int index,int[] nums,List<List<Integer>> ans){
        if(index==nums.length-1){
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                temp.add(nums[i]);
            }
            ans.add(temp);
        }
        
        for(int i=index;i<nums.length;i++){
            swap(i,index,nums);
            recPermute(index+1,nums,ans);
            swap(i,index,nums);
        }
        return ;
    }
    
    public void swap(int l,int r,int[] nums){
        int swap=nums[l];
        nums[l]=nums[r];
        nums[r]=swap;
    }
}