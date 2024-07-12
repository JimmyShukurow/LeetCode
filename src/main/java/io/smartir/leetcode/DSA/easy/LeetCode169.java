package io.smartir.leetcode.DSA.easy;

import java.util.HashMap;
import java.util.Map;

public class LeetCode169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maj = nums.length / 2;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();
            if (val > maj) {
                res = key;
            }
        }
        return res;
                
    }
}
