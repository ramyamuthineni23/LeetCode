class Solution {
    public int prefixCount(String[] words, String pref) {
        int prefLength=pref.length();
        int count=0;
        for(String word:words){
            int length=word.length();
            if(length>=prefLength)
            {
                String subString=word.substring(0,prefLength);
                if(subString.equals(pref))
                count++;
            }
        }

    return count;
    }
}