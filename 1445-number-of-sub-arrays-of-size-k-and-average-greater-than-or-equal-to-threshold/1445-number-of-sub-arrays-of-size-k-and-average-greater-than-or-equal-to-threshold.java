class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int start=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(i-start+1==k){
                int avg = sum/k;
                if(avg>=threshold)count++;
                sum-= arr[start];
                start++;
            }
        }
        return count;
    }
}