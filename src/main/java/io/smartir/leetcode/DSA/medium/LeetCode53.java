package io.smartir.leetcode.DSA.medium;

public class LeetCode53 {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0 && currentSum > maxSum) maxSum = currentSum;
            if(currentSum < 0) currentSum = 0;
            currentSum += nums[i];
        }

        return Math.max(maxSum, currentSum);
    }
}
