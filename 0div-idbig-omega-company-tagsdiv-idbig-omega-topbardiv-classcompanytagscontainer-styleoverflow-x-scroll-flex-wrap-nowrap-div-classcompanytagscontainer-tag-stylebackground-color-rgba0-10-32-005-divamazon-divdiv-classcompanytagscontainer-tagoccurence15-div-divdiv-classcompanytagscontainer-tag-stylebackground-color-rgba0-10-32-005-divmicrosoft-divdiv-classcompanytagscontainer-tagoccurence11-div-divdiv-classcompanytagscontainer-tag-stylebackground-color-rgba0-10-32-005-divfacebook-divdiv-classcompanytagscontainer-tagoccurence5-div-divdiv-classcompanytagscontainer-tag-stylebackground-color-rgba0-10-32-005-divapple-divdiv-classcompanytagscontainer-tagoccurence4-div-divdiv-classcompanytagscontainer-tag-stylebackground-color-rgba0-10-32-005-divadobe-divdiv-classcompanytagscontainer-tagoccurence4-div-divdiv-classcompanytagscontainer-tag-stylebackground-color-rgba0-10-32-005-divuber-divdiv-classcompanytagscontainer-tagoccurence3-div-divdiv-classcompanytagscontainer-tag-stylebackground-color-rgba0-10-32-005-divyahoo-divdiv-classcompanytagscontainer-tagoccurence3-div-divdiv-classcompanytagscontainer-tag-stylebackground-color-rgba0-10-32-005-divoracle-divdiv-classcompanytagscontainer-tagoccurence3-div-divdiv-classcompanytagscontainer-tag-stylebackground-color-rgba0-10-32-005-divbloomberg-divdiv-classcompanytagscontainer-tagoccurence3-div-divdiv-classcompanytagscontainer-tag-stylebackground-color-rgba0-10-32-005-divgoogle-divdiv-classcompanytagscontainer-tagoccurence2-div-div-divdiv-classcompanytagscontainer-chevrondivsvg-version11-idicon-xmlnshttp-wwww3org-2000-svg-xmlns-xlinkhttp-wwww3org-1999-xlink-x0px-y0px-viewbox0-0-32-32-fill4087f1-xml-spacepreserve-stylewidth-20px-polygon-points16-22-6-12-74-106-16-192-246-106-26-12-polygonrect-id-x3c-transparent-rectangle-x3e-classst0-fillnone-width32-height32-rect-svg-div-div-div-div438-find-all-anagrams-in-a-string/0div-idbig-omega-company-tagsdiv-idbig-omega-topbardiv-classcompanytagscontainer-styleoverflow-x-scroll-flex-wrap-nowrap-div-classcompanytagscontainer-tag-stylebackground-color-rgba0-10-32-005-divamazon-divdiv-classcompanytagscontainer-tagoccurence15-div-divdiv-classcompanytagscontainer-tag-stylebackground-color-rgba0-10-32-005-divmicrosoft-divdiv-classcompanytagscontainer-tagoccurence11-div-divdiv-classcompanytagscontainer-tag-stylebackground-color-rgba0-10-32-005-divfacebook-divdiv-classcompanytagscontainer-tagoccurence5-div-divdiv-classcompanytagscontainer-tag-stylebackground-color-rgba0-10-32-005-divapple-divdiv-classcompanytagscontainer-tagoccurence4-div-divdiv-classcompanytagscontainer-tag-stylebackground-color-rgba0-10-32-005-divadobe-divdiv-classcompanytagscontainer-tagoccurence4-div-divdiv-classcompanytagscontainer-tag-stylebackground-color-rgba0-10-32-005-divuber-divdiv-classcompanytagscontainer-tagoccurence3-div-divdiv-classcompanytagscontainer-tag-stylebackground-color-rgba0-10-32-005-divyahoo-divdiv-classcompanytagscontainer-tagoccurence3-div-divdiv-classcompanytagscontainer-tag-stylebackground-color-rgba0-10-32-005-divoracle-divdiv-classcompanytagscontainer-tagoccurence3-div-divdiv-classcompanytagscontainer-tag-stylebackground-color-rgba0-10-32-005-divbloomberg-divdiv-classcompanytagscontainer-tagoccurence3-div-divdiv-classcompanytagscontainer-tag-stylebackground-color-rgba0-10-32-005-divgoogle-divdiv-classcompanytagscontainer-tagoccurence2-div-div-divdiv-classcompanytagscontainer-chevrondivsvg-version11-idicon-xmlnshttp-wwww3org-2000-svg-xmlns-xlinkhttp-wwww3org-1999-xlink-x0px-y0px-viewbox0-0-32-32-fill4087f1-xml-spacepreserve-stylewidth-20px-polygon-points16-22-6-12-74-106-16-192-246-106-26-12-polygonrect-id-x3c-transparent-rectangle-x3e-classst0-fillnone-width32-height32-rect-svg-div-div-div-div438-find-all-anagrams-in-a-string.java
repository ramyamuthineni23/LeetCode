class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        int[] pArray=new int[26];
        int[] ana=new int[26];
        int left=0;
        
        for(int i=0;i<p.length();i++){
            pArray[p.charAt(i)-'a']++;
            
        }
        
        for(int i=0;i<s.length();i++){
            ana[s.charAt(i)-'a']++;
            if(i-left==p.length()-1){
               if(Arrays.equals(pArray,ana)){
                    list.add(left);
                }
                ana[s.charAt(left++)-'a']--;
            }
            
        }
        return list;
    }
}