package io.smartir.leetcode.DSA.medium;

public class LeetCode153 {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        if (nums[left] < nums[right]) return nums[left];
        while (left < right) {
            int mid = (right + left) / 2;
            if (nums[mid] > nums[right] && nums[mid] > nums[left] ) left = mid;
            if (nums[mid] < nums[left]) right = mid ;
            if (left == right-1) break;

        }
        return Math.min(nums[left], nums[right]);
    }
}
