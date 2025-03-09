package io.smartir.leetcode.DSA.medium;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1780 {
    List<Integer> powers = new ArrayList<>();
    public boolean checkPowersOfThree(int n) {
        if (n == 0 || n == 1) return true;
        if (n == 2) return false;
        int num = 1;
        while (num <= n) {
            num *= 3;
        }
        num /= 3;
        if (powers.contains(num)) {
            return false;
        }
        powers.add(num);
        return checkPowersOfThree(n - num);
    }
}
