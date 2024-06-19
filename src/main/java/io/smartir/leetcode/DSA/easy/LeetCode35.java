package io.smartir.leetcode.DSA.easy;

public class LeetCode35 {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3}, 4));
    }
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
            if (nums[i] > target) return i;
        }
        return nums.length;
    }
}
