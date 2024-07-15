package io.smartir.leetcode.DSA.medium;

import java.util.Arrays;

public class LeetCode80 {
    public int removeDuplicates(int[] nums) {
        nums = updateArray(nums);
        return calculateCounter(nums);
    }

    public int calculateCounter(int[] nums) {
        int counter = 1;
        if (nums[0]==nums[1]) counter++;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i + 1]) {
                counter++;
            } else if (i>0 && i< nums.length-1 ) {
                if (nums[i-1] != nums[i] && nums[i] == nums[i+1]) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public int[] updateArray(int[] nums) {
        int innerCounter = 0;
        int slowPointer = 0;
        int fastPointer = 0;
        int k = 1;
        while (slowPointer < nums.length - 1) {
            if (nums[slowPointer] == nums[slowPointer + 1] && innerCounter < 1) {
                slowPointer++;
                innerCounter++;
                continue;
            }
            if (nums[slowPointer] != nums[slowPointer + 1] && innerCounter < 1) {
                slowPointer++;
                innerCounter = 0;
                continue;
            }
            if (nums[slowPointer] == nums[slowPointer + 1] && innerCounter > k) {
                fastPointer = slowPointer;
                while (nums[slowPointer] == nums[fastPointer]) {
                    if (fastPointer >= nums.length - 1) break;
                    fastPointer++;

                }

                int temp = slowPointer + 1;
                while (temp < fastPointer) {
                    nums[temp] = nums[fastPointer];
                    temp++;
                }
                if (fastPointer < nums.length - 1 && nums[fastPointer] == nums[fastPointer + 1]) {
                    nums[++slowPointer] = nums[fastPointer];
                } else {
                    k = 0;
                }
                slowPointer++;
                innerCounter = 0;
            }
            innerCounter++;
        }

        System.out.println(Arrays.toString(nums));
        return nums;
    }
}
