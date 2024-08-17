package io.smartir.leetcode.DSA.easy;

import java.util.HashMap;

public class LeetCode219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> values = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (values.containsKey(nums[i]) && Math.abs(values.get(nums[i])-i)<=k) return true;
            values.put(nums[i], i);
        }
        return false;
    }
}
