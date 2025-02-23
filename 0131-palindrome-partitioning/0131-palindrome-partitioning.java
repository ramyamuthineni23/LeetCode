class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> resultList=new ArrayList<List<String>>();

        combinations(0, s, resultList, new ArrayList<String>());
        return resultList;
    }
    public void combinations(int index, String candidates, List<List<String>> resultList, ArrayList<String> ds){
        
        if(index==candidates.length()){
            resultList.add(new ArrayList<>(ds));    
            return;
        }

        for(int i=index;i<candidates.length();i++){
            if(isPalindrome(candidates,index,i)){
                ds.add(candidates.substring(index,i+1));
                combinations(i+1, candidates, resultList, ds);
                ds.remove(ds.size()-1);
            }
        }
        return ;
    }
    public boolean isPalindrome(String candidates,int start,int end){
        while(start<=end){
            if(candidates.charAt(start++)!=candidates.charAt(end--)) return false;
        }
        return true;
    }

}