class Solution {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        // Work backwards from target (tx, ty) to source (sx, sy)
        while (tx >= sx && ty >= sy) {
            // If tx == ty, we can't reduce further, break to avoid infinite loop
            if (tx == ty) break;

            if (tx > ty) {
                // If ty is still bigger than sy, we can reduce tx using modulo
                if (ty > sy) {
                    tx %= ty;
                } else {
                    // ty is fixed now; check if we can reach tx from sx by adding ty multiple times
                    return (tx - sx) % ty == 0;
                }
            } else {
                // If tx is still bigger than sx, we can reduce ty using modulo
                if (tx > sx) {
                    ty %= tx;
                } else {
                    // tx is fixed now; check if we can reach ty from sy by adding tx multiple times
                    return (ty - sy) % tx == 0;
                }
            }
        }
        // Final check: did we reach exactly the starting point?
        return (tx == sx && ty == sy);
    }
}
