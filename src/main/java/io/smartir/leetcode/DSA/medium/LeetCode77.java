package io.smartir.leetcode.DSA.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode77 {
    List<List<Integer>> combinations = new ArrayList<>();
    int[] digits;
    public List<List<Integer>> combine(int n, int k) {

        if (k == 0) {
            combinations.add(new ArrayList<>());
            return combinations;
        }
        digits = new int[n];
        for (int i = 0; i < n; i++) {
            digits[i] = i + 1;
        }
        System.out.println(Arrays.toString(digits));
        backtrack(new ArrayList<>(), 0, k);
        return combinations;

    }

    private void backtrack(List<Integer> input, int index, int length) {
        if (input.size() == length) {
            combinations.add(input);
            return;
        }
        for (int i = index; i < digits.length; i++) {
            List<Integer> temp = new ArrayList<>(input);
            temp.add(digits[i]);
            backtrack(temp, i + 1, length);
        }
    }
}
