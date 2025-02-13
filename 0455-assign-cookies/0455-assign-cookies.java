class Solution {
   

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int contentChildren=0;
        int cookieIndex=0;
        while(contentChildren<g.length && cookieIndex<s.length){
            if(s[cookieIndex]>=g[contentChildren]){
                contentChildren++;
            }
            cookieIndex++;
        }
        return contentChildren;
    }
}