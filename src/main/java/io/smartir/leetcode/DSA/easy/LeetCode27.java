package io.smartir.leetcode.DSA.easy;

public class LeetCode27 {
    public static void main(String[] args) {

    }
    public int removeElement(int[] nums, int val) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) counter++;
        }
        int[] newNums = new int[nums.length - counter];
        int starter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                newNums[starter] = nums[i];
                starter++;
            }
        }
        for (int i = 0; i < newNums.length; i++) {
            nums[i] = newNums[i];
        }
        return newNums.length;
    }
}
