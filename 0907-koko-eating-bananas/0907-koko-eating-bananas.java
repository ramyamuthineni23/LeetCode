class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int low=1;
        int high=1;
        for(int pile:piles){
            high=pile>high?pile:high;
        }

        while(low<high){
            int mid=(low+high)/2;
            int hours=0;
            for(int i=0;i<n;i++){
                hours+=Math.ceil((double)piles[i]/mid);
            }
            if(hours>h){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return high;

    }
}