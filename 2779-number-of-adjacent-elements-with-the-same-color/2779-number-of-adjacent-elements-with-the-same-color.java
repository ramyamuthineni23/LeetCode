class Solution {
    public static int[] colorTheArray(int n, int[][] queries) {
        int[] colors = new int[n]; // initially 0 (uncolored)
        int[] result = new int[queries.length];
        int count = 0;

        for (int q = 0; q < queries.length; q++) {
            int index = queries[q][0];
            int color = queries[q][1];

            // Step 1: remove old adjacency
            if (colors[index] != 0) {
                if (index > 0 && colors[index] == colors[index - 1]) count--;
                if (index < n - 1 && colors[index] == colors[index + 1]) count--;
            }

            // Step 2: paint new color
            colors[index] = color;

            // Step 3: add new adjacency
            if (colors[index] != 0) {
                if (index > 0 && colors[index] == colors[index - 1]) count++;
                if (index < n - 1 && colors[index] == colors[index + 1]) count++;
            }

            // Step 4: store result
            result[q] = count;
        }

        return result;
    }
}