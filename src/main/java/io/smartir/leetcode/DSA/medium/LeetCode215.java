package io.smartir.leetcode.DSA.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class LeetCode215 {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < nums.length; i++) {
            maxHeap.add(nums[i]);
        }

        while (!maxHeap.isEmpty()) {
            k--;
            if (k==0) return maxHeap.poll();

            maxHeap.poll();
        }

        return nums[0];
    }
}
