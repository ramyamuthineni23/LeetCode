class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        int i=0,j=words.length-1;
        while(i<j){
            String swap=words[i];
            words[i]=words[j];
            words[j]=swap;
            i++;
            j--;
        }
        String result="";
        for(int k=0;k<words.length;k++){
            if(words[k]!="")
            result+=words[k]+" ";
        }
        return result.trim();
    }
}