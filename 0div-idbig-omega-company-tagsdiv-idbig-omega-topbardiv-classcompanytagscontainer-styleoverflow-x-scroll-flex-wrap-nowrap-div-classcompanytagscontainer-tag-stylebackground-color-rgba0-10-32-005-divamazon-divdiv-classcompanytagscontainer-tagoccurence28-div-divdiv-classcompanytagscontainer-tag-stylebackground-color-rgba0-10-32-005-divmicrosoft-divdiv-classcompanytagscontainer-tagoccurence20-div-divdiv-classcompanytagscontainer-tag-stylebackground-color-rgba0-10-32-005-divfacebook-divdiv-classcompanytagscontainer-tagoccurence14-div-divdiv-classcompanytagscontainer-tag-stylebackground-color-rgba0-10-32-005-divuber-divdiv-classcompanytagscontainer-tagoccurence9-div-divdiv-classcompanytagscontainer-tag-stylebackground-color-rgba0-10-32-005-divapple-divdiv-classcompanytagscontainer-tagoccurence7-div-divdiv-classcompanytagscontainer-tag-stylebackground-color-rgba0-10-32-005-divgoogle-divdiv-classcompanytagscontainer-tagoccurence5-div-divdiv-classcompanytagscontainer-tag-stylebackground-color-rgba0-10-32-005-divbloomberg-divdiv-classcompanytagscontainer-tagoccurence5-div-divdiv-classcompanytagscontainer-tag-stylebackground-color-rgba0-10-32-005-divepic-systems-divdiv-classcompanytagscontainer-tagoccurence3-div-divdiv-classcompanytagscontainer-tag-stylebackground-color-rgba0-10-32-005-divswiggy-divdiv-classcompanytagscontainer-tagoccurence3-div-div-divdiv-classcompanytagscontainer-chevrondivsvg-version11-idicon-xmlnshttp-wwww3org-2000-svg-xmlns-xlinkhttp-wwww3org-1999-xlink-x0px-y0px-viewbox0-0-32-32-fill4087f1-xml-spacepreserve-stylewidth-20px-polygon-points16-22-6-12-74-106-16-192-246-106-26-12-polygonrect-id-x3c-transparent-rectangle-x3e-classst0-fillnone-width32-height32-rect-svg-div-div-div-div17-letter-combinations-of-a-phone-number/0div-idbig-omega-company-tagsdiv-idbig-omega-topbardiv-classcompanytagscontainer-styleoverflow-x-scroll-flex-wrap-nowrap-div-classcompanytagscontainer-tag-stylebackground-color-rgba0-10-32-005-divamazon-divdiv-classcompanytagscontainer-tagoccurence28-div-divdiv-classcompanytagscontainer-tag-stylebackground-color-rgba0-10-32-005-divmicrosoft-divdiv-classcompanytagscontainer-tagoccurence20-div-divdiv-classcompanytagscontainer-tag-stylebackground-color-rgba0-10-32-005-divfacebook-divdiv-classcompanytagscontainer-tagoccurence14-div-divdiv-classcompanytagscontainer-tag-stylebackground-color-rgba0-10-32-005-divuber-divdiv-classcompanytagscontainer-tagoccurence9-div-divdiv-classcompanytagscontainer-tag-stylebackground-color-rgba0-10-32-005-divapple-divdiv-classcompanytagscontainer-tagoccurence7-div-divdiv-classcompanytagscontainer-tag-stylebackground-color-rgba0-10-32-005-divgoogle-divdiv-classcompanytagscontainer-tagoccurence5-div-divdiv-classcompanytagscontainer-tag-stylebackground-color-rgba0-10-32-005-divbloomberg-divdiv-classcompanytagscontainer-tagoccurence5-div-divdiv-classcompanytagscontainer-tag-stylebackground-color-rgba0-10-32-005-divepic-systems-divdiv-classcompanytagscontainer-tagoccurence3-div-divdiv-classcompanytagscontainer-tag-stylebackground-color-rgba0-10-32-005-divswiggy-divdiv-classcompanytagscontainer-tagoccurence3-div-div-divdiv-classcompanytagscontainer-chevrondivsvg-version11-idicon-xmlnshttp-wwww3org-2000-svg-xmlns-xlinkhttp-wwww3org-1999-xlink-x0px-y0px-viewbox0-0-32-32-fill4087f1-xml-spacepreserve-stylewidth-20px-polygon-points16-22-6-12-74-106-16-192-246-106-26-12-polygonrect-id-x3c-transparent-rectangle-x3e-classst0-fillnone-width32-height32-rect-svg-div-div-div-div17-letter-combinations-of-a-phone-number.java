class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if(digits==null ||digits.length()==0){
            return result;
        }
        String[] letterStr={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(result, new StringBuilder(), letterStr,digits, 0);
        return result;
    }
    public void backtrack(List<String> result, StringBuilder str,String[] letterStr, String digits, int index){
        if(index==digits.length()){
            result.add(str.toString());
            return;
        }
        int number=digits.charAt(index)-'0';
        String numLetters=letterStr[number];
        for(int i=0;i<numLetters.length();i++){
            str.append(numLetters.charAt(i));
            backtrack(result,str,letterStr,digits,index+1);
            str.deleteCharAt(str.length()-1);
        }
        return;
    }
}