package io.smartir.leetcode.DSA.easy;

import java.util.ArrayList;
import java.util.List;

public class LeetCode228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;
        int left = 0;
        int right = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] + 1 != nums[right]) {
                if (nums[left] != nums[right-1]) result.add(nums[left] + "->" + nums[right-1]);
                else result.add(nums[left]+"");
                left = right;
                right++;
            }else right++;
        }
        if (nums[left] != nums[right-1]) result.add(nums[left] + "->" + nums[right-1]);
        else result.add(nums[left]+"");
        return result;
    }
}
