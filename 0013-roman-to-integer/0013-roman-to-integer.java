class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hash=new HashMap<>();
        hash.put('I',1);
        hash.put('V',5);
         hash.put('X',10);
         hash.put('L',50);
         hash.put('C',100);
         hash.put('D',500);
         hash.put('M',1000);
        int temp=0;
        if(s.length()>1)
        {
            for(int i=0;i<s.length()-1;i++){
                int x=hash.get(s.charAt(i));
                int y=hash.get(s.charAt(i+1));
                if(x>=y){
                    temp+=x;
                    if(i==s.length()-2)
                    {
                        temp+=y;
                        return temp;
                    }
                }
                else{
                    temp+=y-x;
                    i++;
                    i++;
                    if(i==s.length()-1){
                         temp+=hash.get(s.charAt(i));
                    return temp;
                    }
                    if(i==s.length()){
                        return temp;
                    }
                    i--;
                }
            }
        }
        else
             return hash.get(s.charAt(0));
        
    return temp;}
}