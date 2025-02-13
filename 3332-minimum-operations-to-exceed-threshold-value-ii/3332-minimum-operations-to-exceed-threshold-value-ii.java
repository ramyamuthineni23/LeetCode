class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        int n=nums.length;
        for(int num:nums){
            pq.add((long)num);
        }
        int count=0;
        while(pq.size()>1 && pq.peek()<k){
            long x=pq.poll();
            long y=pq.poll();
            pq.add(Math.min(x,y)*2+Math.max(x,y));
            count++;
        }
        return count;
    }
}