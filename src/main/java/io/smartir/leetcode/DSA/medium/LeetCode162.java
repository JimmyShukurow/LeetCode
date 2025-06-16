package io.smartir.leetcode.DSA.medium;

public class LeetCode162 {
    public int findPeakElement(int[] nums) {
        int index = 0;
        if (nums.length > 1 && nums[index] > nums[index + 1]) return 0;
        if (nums.length > 1 && nums[nums.length - 1] > nums[nums.length - 2]) return nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && i < nums.length - 1 && nums[i] > nums[i-1] && nums[i] > nums[i+1])
                return i;
        }

        return index;
    }
}
