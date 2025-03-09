package io.smartir.leetcode.DSA.medium;

public class LeetCode2579 {
    public long coloredCells(int n) {
        return  (long) (2 * Math.pow(n, 2)) - (2L * n) + 1;
    }
}
