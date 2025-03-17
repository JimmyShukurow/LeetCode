package io.smartir.leetcode.DSA.medium;

import java.util.ArrayList;
import java.util.List;

public class LeetCode39 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        int[] sorted = candidates.clone();
        for (int i = 0; i < sorted.length; i++) {
            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[i] > sorted[j]) {
                    int temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }

        if (candidates.length == 1 && candidates[0] != target) {
            return result;
        }
        backtrack(new ArrayList<>(), 0, target, candidates);
        return result;
    }

    private void backtrack(List<Integer> input, int index, int target, int[] candidates) {
        int sum = input.stream().mapToInt(Integer::intValue).sum();
        if (sum == target) {
            result.add(input);
            return;
        }
        if (sum > target || index >= candidates.length) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            List<Integer> temp = new ArrayList<>(input);
            temp.add(candidates[i]);
            backtrack(temp, index + 1, target, candidates);
        }
    }
}
