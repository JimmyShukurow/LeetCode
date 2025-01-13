package io.smartir.leetcode.DSA.easy;

import java.util.HashSet;
import java.util.Set;

public class LeetCode217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> prev = new HashSet<>();
        for (int num : nums) {
            if (prev.contains(num)) return false;
            prev.add(num);
        }
        return true;
    }
}
