class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashSet<Pair<Integer,Integer>> hashSet=new HashSet<Pair<Integer,Integer>>();
        int result=0;
        int[] count=new int[100];
        for(int[] domino:dominoes){
            int a=domino[0];
            int b=domino[1];
            int key=a<b?a*10+b:b*10+a;
            result+=count[key];
            count[key]++;
        }
        return result;
        
    }
    
}