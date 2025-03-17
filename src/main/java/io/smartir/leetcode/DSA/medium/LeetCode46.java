package io.smartir.leetcode.DSA.medium;

import java.util.ArrayList;
import java.util.List;

public class LeetCode46 {
    List<List<Integer>> permutations = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) return permutations;
        backtrack(new ArrayList<>(), nums);
        return permutations;
    }

    private void backtrack(List<Integer> permutation, int[] nums) {
        if (permutation.size() == nums.length) {
            permutations.add(permutation);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            List<Integer> temp = new ArrayList<>(permutation);
            if (temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            backtrack(temp, nums);
        }
    }

}
