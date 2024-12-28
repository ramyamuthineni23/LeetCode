class Solution {

    public int longestConsecutive(int[] nums) {
    
        if(nums.length==0)
            return 0;

        HashSet<Integer> hashSet=new HashSet<>();
        for(int num:nums){
            hashSet.add(num);
        }
        int largest=1;
        for(int val:hashSet){
            if(!hashSet.contains(val-1)){
                int count=1;
                int x=val;
                while(hashSet.contains(x+1)){
                    x+=1;
                    count+=1;
                }
                largest=Math.max(largest,count);
            }
            
        }
        return largest;
    }
}