class Solution {
    public String reverseWords(String str) {
        char[] s=str.toCharArray();
        int ptr1=0;
        int ptr2=0;
        for(int i=0;i<s.length;i++){
            if(s[i]==' '){
                reverse(ptr1,ptr2-1,s);
                ptr1=i+1;
                ptr2=ptr1;
            }
            else{
                ptr2++;
            }
        }
        reverse(ptr1,ptr2-1,s);
        return new String(s);
    }
    public void reverse(int p1, int p2, char[] s){
        while(p1<p2){
             char temp=s[p1];
            s[p1++]=s[p2];
            s[p2--]=temp;
        }
    }
}