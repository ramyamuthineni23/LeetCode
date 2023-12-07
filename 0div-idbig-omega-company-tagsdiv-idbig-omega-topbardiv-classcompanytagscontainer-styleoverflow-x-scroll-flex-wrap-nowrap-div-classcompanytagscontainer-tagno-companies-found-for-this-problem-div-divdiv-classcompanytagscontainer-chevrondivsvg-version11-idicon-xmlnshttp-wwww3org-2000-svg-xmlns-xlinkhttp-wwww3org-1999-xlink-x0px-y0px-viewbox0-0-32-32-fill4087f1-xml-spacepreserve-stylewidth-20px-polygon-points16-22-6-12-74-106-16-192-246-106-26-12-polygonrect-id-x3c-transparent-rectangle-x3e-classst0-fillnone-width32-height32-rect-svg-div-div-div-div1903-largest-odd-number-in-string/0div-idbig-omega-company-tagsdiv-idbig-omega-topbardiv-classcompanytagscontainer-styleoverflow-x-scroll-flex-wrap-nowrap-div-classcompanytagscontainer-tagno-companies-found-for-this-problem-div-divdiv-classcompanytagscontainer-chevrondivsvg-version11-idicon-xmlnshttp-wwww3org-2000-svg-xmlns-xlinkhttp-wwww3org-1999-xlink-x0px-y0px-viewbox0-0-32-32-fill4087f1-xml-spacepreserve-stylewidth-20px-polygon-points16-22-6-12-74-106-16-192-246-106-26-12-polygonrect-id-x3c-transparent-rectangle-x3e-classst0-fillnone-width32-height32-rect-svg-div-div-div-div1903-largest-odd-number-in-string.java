class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        int index=-1;
        for(int i=n-1;i>=0;i--){
            int digit=(int)num.charAt(i);
            if(digit%2==1){
                index=i;
                break;
            }
        }
        return index!=-1?num.substring(0,index+1):"";
    }
}