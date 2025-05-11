class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int i=0,n=arr.length;
        while(i<=n-3){
            int left=arr[i];
            int mid=arr[i+1];
            int right=arr[i+2];
            if(left%2==1&&mid%2==1&&right%2==1){
                return true;
            }
            i++;
        }
        return false;
    }
}