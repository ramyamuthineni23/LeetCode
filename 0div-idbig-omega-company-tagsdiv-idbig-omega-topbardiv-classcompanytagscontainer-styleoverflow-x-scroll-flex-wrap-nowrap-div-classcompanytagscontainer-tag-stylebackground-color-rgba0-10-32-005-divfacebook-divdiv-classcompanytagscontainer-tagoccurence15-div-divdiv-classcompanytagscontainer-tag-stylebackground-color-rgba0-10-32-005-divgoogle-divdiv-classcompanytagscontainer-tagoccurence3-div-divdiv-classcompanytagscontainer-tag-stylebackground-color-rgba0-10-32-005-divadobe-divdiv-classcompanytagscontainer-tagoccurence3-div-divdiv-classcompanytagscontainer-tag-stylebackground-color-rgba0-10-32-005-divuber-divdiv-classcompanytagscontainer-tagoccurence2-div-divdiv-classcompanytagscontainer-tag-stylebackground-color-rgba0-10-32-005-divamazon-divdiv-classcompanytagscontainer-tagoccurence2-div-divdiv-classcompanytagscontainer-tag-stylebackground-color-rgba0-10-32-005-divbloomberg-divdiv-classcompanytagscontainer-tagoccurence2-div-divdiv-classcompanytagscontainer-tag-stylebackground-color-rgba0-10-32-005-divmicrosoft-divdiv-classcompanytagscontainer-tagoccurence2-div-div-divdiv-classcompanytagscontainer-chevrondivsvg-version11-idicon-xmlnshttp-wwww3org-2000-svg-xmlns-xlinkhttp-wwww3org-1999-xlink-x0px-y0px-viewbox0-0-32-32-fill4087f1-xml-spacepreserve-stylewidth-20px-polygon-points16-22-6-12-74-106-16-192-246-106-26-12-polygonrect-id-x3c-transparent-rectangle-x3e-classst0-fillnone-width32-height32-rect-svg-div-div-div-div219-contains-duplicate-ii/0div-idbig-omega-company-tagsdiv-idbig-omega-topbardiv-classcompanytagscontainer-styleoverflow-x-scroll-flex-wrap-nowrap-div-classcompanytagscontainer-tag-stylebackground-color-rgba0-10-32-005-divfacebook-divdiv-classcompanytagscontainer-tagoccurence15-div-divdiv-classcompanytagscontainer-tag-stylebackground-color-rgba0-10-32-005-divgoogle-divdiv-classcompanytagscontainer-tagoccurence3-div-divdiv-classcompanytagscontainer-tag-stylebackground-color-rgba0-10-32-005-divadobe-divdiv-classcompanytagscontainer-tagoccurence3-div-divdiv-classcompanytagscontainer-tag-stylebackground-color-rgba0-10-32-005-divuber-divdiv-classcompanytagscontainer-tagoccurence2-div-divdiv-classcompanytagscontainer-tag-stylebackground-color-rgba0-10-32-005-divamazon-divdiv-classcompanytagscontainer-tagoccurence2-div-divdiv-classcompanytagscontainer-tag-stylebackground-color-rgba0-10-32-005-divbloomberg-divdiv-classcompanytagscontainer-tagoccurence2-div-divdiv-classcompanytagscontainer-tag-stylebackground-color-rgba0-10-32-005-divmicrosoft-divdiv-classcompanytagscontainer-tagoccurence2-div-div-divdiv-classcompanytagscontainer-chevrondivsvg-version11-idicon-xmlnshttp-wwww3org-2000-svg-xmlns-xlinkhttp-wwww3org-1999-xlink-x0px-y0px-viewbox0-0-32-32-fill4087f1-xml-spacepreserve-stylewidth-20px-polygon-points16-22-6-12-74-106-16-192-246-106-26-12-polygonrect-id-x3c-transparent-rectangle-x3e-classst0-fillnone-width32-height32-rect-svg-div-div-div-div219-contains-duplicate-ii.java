class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hash=new HashSet<>();
        int l=0;
        for(int r=0;r<nums.length;r++){
            if(r-l>k){
                hash.remove(nums[l++]);
            }
            if(hash.contains(nums[r])){
                return true;
            }
            hash.add(nums[r]);
        }
        return false;
    }
}