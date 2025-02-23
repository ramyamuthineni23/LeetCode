class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resultList=new ArrayList<List<Integer>>();

        combinations(0, candidates, target, resultList, new ArrayList<Integer>());
        return resultList;
    }
    public void combinations(int index, int[] candidates, int target, List<List<Integer>> resultList, ArrayList<Integer> ds){
        
        if(index==candidates.length){
            if(target==0){
                resultList.add(new ArrayList<>(ds));
                
            }
            return;
        }

        if(candidates[index]<=target){
            ds.add(candidates[index]);
            combinations(index, candidates, target-candidates[index], resultList, ds);
            ds.remove(ds.size()-1);
        }
        combinations(index+1, candidates, target, resultList, ds);

        return ;
    }

}