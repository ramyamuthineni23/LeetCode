class Solution {
    public boolean checkInclusion(String s1, String s2) {
         int[] pArray=new int[26];
        int[] ana=new int[26];
        int left=0;
        
        for(int i=0;i<s1.length();i++){
            pArray[s1.charAt(i)-'a']++;
            
        }
        
        for(int i=0;i<s2.length();i++){
            ana[s2.charAt(i)-'a']++;
            if(i-left==s1.length()-1){
               if(Arrays.equals(pArray,ana)){
                    return true;
                }
                ana[s2.charAt(left++)-'a']--;
            }
            
        }
        return false;
    }
}