class Solution {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int x1 = startPos[0], y1 = startPos[1];
        int x2 = homePos[0], y2 = homePos[1];
        int cost = 0;

        // Move in rows
        if (x2 > x1) {
            for (int i = x1 + 1; i <= x2; i++) cost += rowCosts[i];
        } else {
            for (int i = x1 - 1; i >= x2; i--) cost += rowCosts[i];
        }

        // Move in columns
        if (y2 > y1) {
            for (int i = y1 + 1; i <= y2; i++) cost += colCosts[i];
        } else {
            for (int i = y1 - 1; i >= y2; i--) cost += colCosts[i];
        }

        return cost;
    }
}