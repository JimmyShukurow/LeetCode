package io.smartir.leetcode.DSA.medium;

import java.util.Arrays;

public class LeetCode209 {
    public int minSubArrayLen(int target, int[] nums) {
        if (Arrays.stream(nums).sum() < target) return 0;
        if (Arrays.stream(nums).anyMatch(num-> num==target)) return 1;
        int left = 0, right = 1;
        int sum = nums[left];
        int ans = Integer.MAX_VALUE;
        while (left <= right) {
            if (sum >= target) {
                ans = Math.min(right  - left, ans);
                sum -= nums[left];
                left++;
                continue;
            } else if (right < nums.length) {
                sum += nums[right];
                right++;
            } else left++;
        }

        return ans;
    }
}
