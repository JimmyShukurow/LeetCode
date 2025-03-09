package io.smartir.leetcode.DSA.medium;

public class LeetCode1749 {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = 0;
        int minSum = 0;
        int temp = 0;
        for (int num : nums) {
            temp += num;
            if (temp < 0) temp = 0;
            if (temp > maxSum) {
                maxSum = temp;
            }
        }
        temp = 0;
        for (int num : nums) {
            temp += num;
            if (temp > 0) temp = 0;
            if (temp < minSum) {
                minSum = temp;
            }
        }
        minSum = Math.abs(minSum);
        maxSum = Math.abs(maxSum);
        return Math.max(minSum, maxSum);
    }
}
