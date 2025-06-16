package io.smartir.leetcode.DSA.medium;

public class LeetCode34 {
    int[] result = {-1, -1};

    public int[] searchRange(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = (r + l) / 2;
            if (nums[m] == target) {
                expandLeft(nums, target, m);
                expandRight(nums, target, m);
                return result;
            }
            if (nums[m]> target) r = m - 1;
            if (nums[m]< target) l = m + 1;
        }
        return result;

    }

    public void expandLeft(int[] nums, int target, int initialPos) {
        while (initialPos > 0 && nums[initialPos - 1] == target) initialPos--;
        result[0] = initialPos;
    }
    public void expandRight(int[] nums, int target, int initialPos) {
        while (initialPos < nums.length-1 && nums[initialPos + 1] == target) initialPos++;
        result[1] = initialPos;
    }
}
