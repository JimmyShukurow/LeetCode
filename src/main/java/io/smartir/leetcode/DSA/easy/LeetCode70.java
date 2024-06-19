package io.smartir.leetcode.DSA.easy;

public class LeetCode70 {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 3;
        int first = 1;
        int second = 2;
        for (int i = 3; i < n; i++) {
            int temp = first + second;
            first = second;
            second = temp;
        }
        return  first+second;
    }
}
