class Solution {
    public int sumSubarrayMins(int[] arr) {
        int mod=1000000007;
        Stack<Integer> stack=new Stack<Integer>();
        int n=arr.length;
        int[] dp=new int[n];
        
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && (arr[stack.peek()]>=arr[i]))
            {
                stack.pop();
            }
            if(stack.size()>0){
                int prevElement=stack.peek();
                dp[i]=dp[prevElement]+(i-prevElement)*arr[i];
                
            }
            else{
                dp[i]=(i+1)*arr[i];
            
            }
            stack.push(i);
        }
        int sum=0;
        for(int count:dp){
            sum+=count;
            sum%=mod;
        }
        return sum;
    }
}