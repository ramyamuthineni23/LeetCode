class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] remainders = new int[60]; // Count of song durations % 60
        int count = 0;

        for (int t : time) {
            int rem = t % 60; // Current song's remainder

            // If remainder is 0, we pair with other remainder-0 songs
            if (rem == 0) {
                count += remainders[0];
            } else {
                // Otherwise, pair with complement remainder (60 - rem)
                count += remainders[60 - rem];
            }

            // Update count of current remainder
            remainders[rem]++;
        }

        return count;
    }
}
