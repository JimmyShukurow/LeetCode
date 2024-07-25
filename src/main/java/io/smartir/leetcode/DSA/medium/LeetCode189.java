package io.smartir.leetcode.DSA.medium;

import java.util.Arrays;

public class LeetCode189 {
    public void rotate(int[] nums, int k) {
        int[] newNums = new int[nums.length];
        k = k % nums.length;
        for (int i = 0; i < nums.length; i++) {
            int pointer = Math.abs(nums.length-k+i) % nums.length;
            newNums[i] = nums[pointer];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = newNums[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
