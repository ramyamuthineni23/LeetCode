class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i:nums1){
            hashSet.add(i);
        }
        ArrayList<Integer> result=new ArrayList<>();
        for(int i:nums2){
            if(hashSet.contains(i) && !result.contains(i)){
                result.add(i);
            }
        }
        return result.stream().mapToInt(i->i).toArray();
    }
}