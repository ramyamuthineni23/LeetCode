class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> resultList=new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        combinations(0, candidates, target, resultList, new ArrayList<Integer>());
        return resultList;
    }
    public void combinations(int index, int[] candidates, int target, List<List<Integer>> resultList, ArrayList<Integer> ds){
        
        if(target==0){
            resultList.add(new ArrayList<>(ds));
            return;
        }

        for(int i=index;i<candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1]) continue;
            if(candidates[index]>target) break;

            ds.add(candidates[i]);
            combinations(i+1, candidates, target-candidates[i], resultList, ds);
            ds.remove(ds.size()-1);
        }

        return ;
    }
}