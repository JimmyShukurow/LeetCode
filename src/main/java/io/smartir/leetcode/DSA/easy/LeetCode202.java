package io.smartir.leetcode.DSA.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode202 {
    List<Integer> before = new ArrayList<>();
    public boolean isHappy(int n) {
        if (n==1) return true;
        if (before.contains(n)) return false;
        before.add(n);
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + (digit*digit);
            n /= 10;
        }
        System.out.println(sum);
        return isHappy(sum);
    }
}
