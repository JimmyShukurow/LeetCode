package io.smartir.leetcode.DSA.medium;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1980 {
    List<String> possible = new ArrayList<>();
    public String findDifferentBinaryString(String[] nums) {
        helper("", nums[0].length());
        for (String num : nums) {
            possible.remove(num);
        }
        return possible.get(0);
    }

    private void helper(String prefix, int n){
        if (n == 0){
            possible.add(prefix);
            return;
        }
        helper(prefix + "0", n - 1);
        helper(prefix + "1", n - 1);
    }
}
