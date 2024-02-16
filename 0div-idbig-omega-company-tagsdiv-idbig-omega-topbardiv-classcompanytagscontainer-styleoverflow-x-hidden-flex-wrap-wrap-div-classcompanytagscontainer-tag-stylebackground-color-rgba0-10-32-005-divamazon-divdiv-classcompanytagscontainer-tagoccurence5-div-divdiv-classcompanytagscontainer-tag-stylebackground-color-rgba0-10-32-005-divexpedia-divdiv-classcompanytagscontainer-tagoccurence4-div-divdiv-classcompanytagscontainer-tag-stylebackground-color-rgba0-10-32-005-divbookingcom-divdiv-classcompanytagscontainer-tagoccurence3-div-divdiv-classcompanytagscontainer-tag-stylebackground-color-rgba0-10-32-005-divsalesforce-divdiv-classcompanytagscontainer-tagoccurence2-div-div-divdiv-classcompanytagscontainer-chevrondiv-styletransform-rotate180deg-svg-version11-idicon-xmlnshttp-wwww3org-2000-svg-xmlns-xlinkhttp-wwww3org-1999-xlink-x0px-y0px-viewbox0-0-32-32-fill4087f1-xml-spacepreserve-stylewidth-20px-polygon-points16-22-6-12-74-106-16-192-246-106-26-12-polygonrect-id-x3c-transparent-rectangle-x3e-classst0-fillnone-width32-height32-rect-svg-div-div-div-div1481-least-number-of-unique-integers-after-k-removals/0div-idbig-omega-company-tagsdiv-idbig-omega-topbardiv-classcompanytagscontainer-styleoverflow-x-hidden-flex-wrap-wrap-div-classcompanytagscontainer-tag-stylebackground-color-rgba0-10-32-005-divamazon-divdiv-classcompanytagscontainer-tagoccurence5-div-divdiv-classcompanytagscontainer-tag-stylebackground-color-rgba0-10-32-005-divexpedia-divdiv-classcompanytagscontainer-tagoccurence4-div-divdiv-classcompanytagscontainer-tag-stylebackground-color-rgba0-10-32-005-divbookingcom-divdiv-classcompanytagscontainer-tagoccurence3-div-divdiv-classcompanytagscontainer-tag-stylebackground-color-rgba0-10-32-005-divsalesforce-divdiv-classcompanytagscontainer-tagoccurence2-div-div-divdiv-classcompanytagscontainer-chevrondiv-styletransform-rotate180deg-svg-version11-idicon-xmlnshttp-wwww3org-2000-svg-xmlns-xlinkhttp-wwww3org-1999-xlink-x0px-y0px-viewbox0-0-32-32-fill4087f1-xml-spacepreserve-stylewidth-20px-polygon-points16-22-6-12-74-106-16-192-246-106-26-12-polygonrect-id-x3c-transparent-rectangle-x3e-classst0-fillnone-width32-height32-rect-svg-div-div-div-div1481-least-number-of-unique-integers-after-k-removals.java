class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i:arr){
            hash.put(i,hash.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(hash.values());
        int ele=0;
        while(!pq.isEmpty()){
            ele +=pq.peek();
            if(ele>k){
                return pq.size();
            }
            pq.poll();
        }
        return 0;
    }
}