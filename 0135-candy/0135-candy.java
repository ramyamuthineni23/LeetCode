class Solution {
    public int candy(int[] rating) {
        int[] candies=new int[rating.length];

        Arrays.fill(candies,1);
        int n=rating.length;
        for(int i=1;i<n;i++){
            if(rating[i]>rating[i-1]){
                candies[i]=candies[i-1]+1;
            }
        }

        for(int i=n-2;i>=0;i--){
            if(rating[i]>rating[i+1]){
                candies[i]=Math.max(candies[i+1]+1,candies[i]);
            }
        }
        int sum=0;
        for(int val:candies){
            sum+=val;
        }
        return sum;
    }
}