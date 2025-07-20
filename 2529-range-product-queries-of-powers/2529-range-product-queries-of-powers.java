class Solution {
    public int[] productQueries(int n, int[][] queries) {
        List<Integer> powers = new ArrayList<>();
        int MOD = 1_000_000_007;

        // Step 1: Extract set bits as powers of 2
        for (int i = 0; i < 32; i++) {
            if (((n >> i) & 1) == 1) {
                powers.add(1 << i);
            }
        }

        // Step 2: Compute prefix products
        int m = powers.size();
        long[] prefixProduct = new long[m + 1];
        prefixProduct[0] = 1;
        for (int i = 0; i < m; i++) {
            prefixProduct[i + 1] = (prefixProduct[i] * powers.get(i)) % MOD;
        }

        // Step 3: Answer queries
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            long product = prefixProduct[right + 1] * modInverse(prefixProduct[left], MOD) % MOD;
            result[i] = (int) product;
        }

        return result;
    }

    // Modular inverse using Fermat's little theorem
    private long modInverse(long x, int mod) {
        return pow(x, mod - 2, mod);
    }

    private long pow(long x, int exp, int mod) {
        long res = 1;
        x = x % mod;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = res * x % mod;
            }
            x = x * x % mod;
            exp >>= 1;
        }
        return res;
    }
}
