class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> hashSet=new HashSet<>();
        for(int i=0;i<=s.length()-k;i++){
            String substring=s.substring(i,i+k);
            hashSet.add(substring);
            
        }
        if(hashSet.size()==Math.pow(2,k))
            return true;
        return false;
    }
}