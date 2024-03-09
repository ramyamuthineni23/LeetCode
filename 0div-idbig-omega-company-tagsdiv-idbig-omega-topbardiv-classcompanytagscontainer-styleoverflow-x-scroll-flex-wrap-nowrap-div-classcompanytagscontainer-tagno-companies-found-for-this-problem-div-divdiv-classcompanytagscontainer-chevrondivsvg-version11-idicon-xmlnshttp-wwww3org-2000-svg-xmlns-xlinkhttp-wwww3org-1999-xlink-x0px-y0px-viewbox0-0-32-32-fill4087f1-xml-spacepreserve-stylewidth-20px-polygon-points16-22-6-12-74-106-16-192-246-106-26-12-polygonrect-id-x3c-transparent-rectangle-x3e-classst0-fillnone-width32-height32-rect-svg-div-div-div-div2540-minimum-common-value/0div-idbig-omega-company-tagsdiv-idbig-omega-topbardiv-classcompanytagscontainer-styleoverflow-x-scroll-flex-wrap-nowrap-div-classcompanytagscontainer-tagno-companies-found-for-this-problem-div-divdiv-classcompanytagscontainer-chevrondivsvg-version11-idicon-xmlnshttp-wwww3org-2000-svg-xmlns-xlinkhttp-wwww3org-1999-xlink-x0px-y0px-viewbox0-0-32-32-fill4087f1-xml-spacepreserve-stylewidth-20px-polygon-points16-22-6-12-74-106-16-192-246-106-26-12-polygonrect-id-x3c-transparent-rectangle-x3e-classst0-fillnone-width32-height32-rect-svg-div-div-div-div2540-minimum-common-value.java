class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        if(n1<n2){
            return get(nums1,nums2,n1,n2);
        }
        else{
            return get(nums2,nums1,n2,n1);
        }
        
    }
    public int get(int[] nums1,int[] nums2,int n1,int n2){
        
        HashSet<Integer> hash=new HashSet<>();
        for(int i=0;i<n1;i++)
        {
            hash.add(nums1[i]);
        }
        for(int i=0;i<n2;i++){
            if(hash.contains(nums2[i])){
                return nums2[i];
            }
        }
        return -1;
    }
}