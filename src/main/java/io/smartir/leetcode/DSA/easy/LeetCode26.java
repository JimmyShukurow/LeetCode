package io.smartir.leetcode.DSA.easy;


import java.util.Arrays;

public class LeetCode26 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }

    public static int removeDuplicates(int[] nums) {
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right];

            }
        }
        return left + 1;
    }
}
