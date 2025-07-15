class Solution {
    public int[][] permute(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), n);
        int[][]arr = new int[ans.size()][n];

        for(int i = 0; i < ans.size(); i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = ans.get(i).get(j);
            }
        }
        return arr;
    }

    public void backtrack(List<List<Integer>> ans, List<Integer> curr, int n){
        if(curr.size() == n){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i = 1; i <= n; i++){
            if(!curr.contains(i)){
                //check two numbers are both even or both odd
                if( curr.isEmpty() || (curr.get(curr.size()-1) + i) % 2 != 0){
                    curr.add(i);
                    backtrack(ans, curr, n);
                    curr.remove(curr.size()-1);
                }
            }
        }
    }
}