package io.smartir.leetcode.DSA.medium;

import java.util.ArrayList;
import java.util.List;

public class LeetCode2161 {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] < pivot)) {
                left.add(nums[i]);
            }
            if ((nums[i] > pivot)) {
                right.add(nums[i]);
            }
        }
        for (int i = 0; i < left.size(); i++) {
            nums[i] = left.get(i);
        }
        int equalToPivot = nums.length - left.size() - right.size();
        for (int i = 0; i < equalToPivot; i++) {
            nums[left.size() + i] = pivot;
        }
        for (int i = 0; i < right.size(); i++) {
            nums[left.size() + equalToPivot + i] = right.get(i);
        }
        return nums;
    }
}
