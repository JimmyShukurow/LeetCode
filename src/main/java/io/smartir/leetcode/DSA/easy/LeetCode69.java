package io.smartir.leetcode.DSA.easy;

public class LeetCode69 {
    public int mySqrt(int x) {
        if (x<=1) return x;
        int start = x / 2;
        int end = (start + x / start) / 2;
        while (end < start) {
            start = end;
            end =(start + x / start) / 2;
        }
        return start;
    }
}
