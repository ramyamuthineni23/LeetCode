class Solution {
    public List<Integer> goodIndices(int[] nums, int k) {
        int left[]=new int[nums.length];
        left[0]=1;
       
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]<nums[i])
            left[i]=1;
            else
            left[i]=left[i-1]+1;
        }
        int right[]=new int[nums.length];
         right[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]>nums[i+1])
            right[i]=1;
            else
            right[i]=right[i+1]+1;
        }
        List<Integer> l=new ArrayList<>();
        for(int i=k;i<nums.length-k;i++)
        {
            if(left[i-1]>=k && right[i+1]>=k)
            l.add(i);
        }
        return l;

    }
}