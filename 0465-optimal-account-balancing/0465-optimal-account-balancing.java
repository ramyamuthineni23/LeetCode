class Solution {
    public int minTransfers(int[][] transactions) {
        
        // Step 1: Calculate net balance for each person
        Map<Integer, Integer> balanceMap = new HashMap<>();
        for (int[] t : transactions) {
            int from = t[0], to = t[1], amount = t[2];
            balanceMap.put(from, balanceMap.getOrDefault(from, 0) - amount);
            balanceMap.put(to, balanceMap.getOrDefault(to, 0) + amount);
        }

        // Step 2: Collect non-zero balances
        List<Integer> balances = new ArrayList<>();
        for (int amount : balanceMap.values()) {
            if (amount != 0) {
                balances.add(amount);
            }
        }

        // Step 3: Backtrack to find minimum number of transactions
        return dfs(balances, 0);
    }

    private int dfs(List<Integer> balances, int start) {
        // Skip settled debts
        while (start < balances.size() && balances.get(start) == 0) {
            start++;
        }

        if (start == balances.size()) return 0;

        int minTransactions = Integer.MAX_VALUE;

        for (int i = start + 1; i < balances.size(); i++) {
            // Only try to settle with opposite signs
            if (balances.get(i) * balances.get(start) < 0) {
                // Try settling balances[start] with balances[i]
                balances.set(i, balances.get(i) + balances.get(start));
                
                // Recurse and count this as one transaction
                minTransactions = Math.min(minTransactions, 1 + dfs(balances, start + 1));

                // Backtrack
                balances.set(i, balances.get(i) - balances.get(start));
            }
        }

        return minTransactions;
    }
}
