package io.smartir.leetcode.DSA.medium;

import java.util.ArrayList;
import java.util.List;

public class LeetCode2375 {
    public String smallestNumber(String pattern) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == 'D') {
                int left = i;
                int right = i;
                while (i < pattern.length() && pattern.charAt(i) == 'D') {
                    right++;
                    i++;
                }
                while (left < right) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left++;
                    right--;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < pattern.length()+1; i++) {
            result.append(nums[i]);
        }
        return result.toString();
    }
}
