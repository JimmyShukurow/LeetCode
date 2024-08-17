package io.smartir.leetcode.DSA.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LeetCode128 {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        int counter = 0;
        TreeSet<Integer> values = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            values.add(nums[i]);
        }
        int firstElement = values.first();
        int tempCounter = 0;
        for (Integer value : values) {
            if (value == firstElement+1) {
                tempCounter++;
            }else {
                counter = Math.max(counter, tempCounter+1);
                tempCounter = 0;
            }
            firstElement = value;
        }
        counter = Math.max(counter, tempCounter+1);
        return counter;
    }
}
