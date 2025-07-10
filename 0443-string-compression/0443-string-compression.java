class Solution {
    public int compress(char[] chars) {
        int i=0, n=chars.length;
        int res=0;
        
        while(i<n){
            int groupLength=1;
            if(res<n){
            chars[res++]=chars[i];
            while(i+groupLength<n && chars[i+groupLength]==chars[i]){
                groupLength++;
            }
            if(groupLength>1){
            for(char ch:String.valueOf(groupLength).toCharArray()){
                chars[res++]=ch;
            }}}
            i=i+groupLength;
        }
        return res;
    }
}