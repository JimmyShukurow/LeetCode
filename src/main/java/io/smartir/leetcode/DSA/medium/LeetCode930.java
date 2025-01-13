package io.smartir.leetcode.DSA.medium;

public class LeetCode930 {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            if (sum == goal) counter++;
            for (int j = i+1; j < nums.length; j++) {
                sum += nums[j];
                if (sum == goal) counter++;
            }
        }
        return counter;
    }
}
