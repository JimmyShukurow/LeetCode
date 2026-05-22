package io.smartir.leetcode.DSA.easy;

import java.util.stream.Stream;

public class LeetCode191 {

    public int hammingWeight(int n) {

        int bitCounts = 0;
        while (n != 0) {
            bitCounts += (n & 1);
            n = n >>> 1;
        }
        return bitCounts;
    }
}
