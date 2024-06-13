package io.smartir.leetcode.DSA.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSomeAnotherWay(nums, target)));

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i==j) continue;
                if (nums[i] + nums[j] == target) {
                    solution[0] = i;
                    solution[1] = j;
                }
            }
        }
        return solution;
    }

    public static int[] twoSomeAnotherWay(int[] nums, int target) {
        int[] solution = new int[2];
        HashMap<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numbers.containsValue(target - nums[i])) {
                solution[0] = i;
                for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
                    if (entry.getValue().equals(target - nums[i])) {
                        solution[1] = entry.getKey();
                    }
                }
            }
            numbers.put(i, nums[i]);
        }
        
        return solution;
    }
}
