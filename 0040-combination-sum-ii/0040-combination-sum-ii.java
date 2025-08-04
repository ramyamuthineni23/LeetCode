class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);  // Sort to handle duplicates
        backtrack(candidates, 0, target, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] candidates, int start, int target,
                           List<Integer> current, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(current));  // Found valid combination
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates at the same level
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            if (candidates[i] > target) break; // Early stop

            current.add(candidates[i]);
            backtrack(candidates, i + 1, target - candidates[i], current, res);
            current.remove(current.size() - 1);  // Backtrack
        }
    }
}

