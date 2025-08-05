class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] population = new int[101]; // years from 1950 to 2050

        for (int[] log : logs) {
            int birth = log[0];
            int death = log[1];
            population[birth - 1950]++;
            population[death - 1950]--;
        }

        int maxYear = 1950;
        int maxPop = 0;
        int currPop = 0;

        for (int i = 0; i < 101; i++) {
            currPop += population[i];
            if (currPop > maxPop) {
                maxPop = currPop;
                maxYear = 1950 + i;
            }
        }

        return maxYear;
    }
}
