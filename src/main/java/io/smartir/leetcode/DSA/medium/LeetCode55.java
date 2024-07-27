package io.smartir.leetcode.DSA.medium;

public class LeetCode55 {
    public boolean canJump(int[] nums) {
        if(nums.length== 1) return true;
        if (nums[0] == 0) return false;
        int counter = 0;
        here:
        for (int i = 0; i < nums.length ; i++) {
            if (i == nums.length-1) return true;
            if (nums[i] == 0) {
                int temp = i;
                while (true) {
                    counter++;
                    temp--;
                    if (temp ==-1) return false;
                    if (nums[temp] > counter) {
                        counter = 0;
                        continue here;
                    }
                }
            }
        }
        return true;
    }
}
