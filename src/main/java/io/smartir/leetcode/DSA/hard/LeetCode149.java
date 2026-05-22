package io.smartir.leetcode.DSA.hard;

public class LeetCode149 {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n <= 2) return n;

        int ans = 2;
        long[] keys = new long[1024];
        int[] vals = new int[1024];

        for (int i = 0; i < n; i++) {
            if (ans >= n - i) break;

            java.util.Arrays.fill(vals, 0);

            int xi = points[i][0];
            int yi = points[i][1];
            int localMax = 0;

            for (int j = i + 1; j < n; j++) {
                int dx = points[j][0] - xi;
                int dy = points[j][1] - yi;

                if (dx == 0) {
                    dy = 1;
                } else if (dy == 0) {
                    dx = 1;
                } else {
                    int a = dx < 0 ? -dx : dx;
                    int b = dy < 0 ? -dy : dy;

                    while (b != 0) {
                        int t = a % b;
                        a = b;
                        b = t;
                    }

                    dx /= a;
                    dy /= a;

                    if (dx < 0) {
                        dx = -dx;
                        dy = -dy;
                    }
                }

                long key = ((long)dx << 32) | (dy & 0xffffffffL);
                int h = (int)(key ^ (key >>> 32)) & 1023;

                while (vals[h] != 0) {
                    if (keys[h] == key) break;
                    h = (h + 1) & 1023;
                }

                if (vals[h] == 0) keys[h] = key;

                int c = ++vals[h];

                if (c > localMax) localMax = c;
            }

            if (localMax + 1 > ans) ans = localMax + 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        LeetCode149 test = new LeetCode149();
        System.out.println(test.maxPoints(new int[][]{{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}}));
    }
}
