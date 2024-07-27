package io.smartir.leetcode.DSA.medium;

public class LeetCode45 {
    public int jump(int[] nums) {
        int steps = 1;
        return innerJump(nums, 0, nums[0], nums.length - nums[0], steps);
    }

    public int innerJump(int[] nums,int startPoint, int endPoint, int length, int steps) {
        for (int i = startPoint+1; i < startPoint+endPoint+1; i++) {
            if ( length - nums[i] == 0) return ++steps;
            if ( length - nums[i] < 0) return steps;
            steps += innerJump(nums, i, nums[i], length - nums[i], steps);
        }
        return steps;
    }
}
