package io.smartir.leetcode.DSA.medium;

public class LeetCode11 {
    public int maxArea(int[] height) {
        int waterAmount = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            waterAmount = Math.max(waterAmount, minHeight * (right - left));
            if (height[left] < height[right]) left++;
            else right--;
        }
        return waterAmount;
    }
}
