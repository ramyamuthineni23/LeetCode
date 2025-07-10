public class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {

        // Difference array +prefixSum;
        int[] answer = new int[n];

        for (int[] booking : bookings) {
            int start = booking[0] - 1; // convert to 0-based
            int end = booking[1];       // exclusive for subtraction
            int seats = booking[2];

            answer[start] += seats;
            if (end < n) {
                answer[end] -= seats;
            }
        }

        // Prefix sum to get actual bookings
        for (int i = 1; i < n; i++) {
            answer[i] += answer[i - 1];
        }

        return answer;
    }
}
