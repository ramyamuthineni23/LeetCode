class Solution {
    public int maxScore(String s) {
        String left="";
        String right="";

        int max=0;

        int rightOnes=0;
        int leftZeros=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
                rightOnes++;       
            
        }

        for(int i=0;i<s.length()-1;i++){
            
            if(s.charAt(i)=='0')
                leftZeros+=1;

            if(s.charAt(i)=='1')
                rightOnes--;
            

            System.out.println(leftZeros+" "+rightOnes);
            System.out.println(" ");

            max=Math.max(leftZeros+rightOnes,max);
        }
        return max;
    }
}