package io.smartir.leetcode.DSA.easy;


import java.util.Arrays;

public class LeetCode26 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }

    public static int removeDuplicates(int[] nums) {
        int counter = 0;
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
           if(temp != nums[i]){
               counter++;
               temp = nums[i];
           }
        }
        int[] newnums = new int[counter+1];
        int starter = 1;
        temp = nums[0];
        newnums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(temp != nums[i]){
                newnums[starter] = nums[i];
                starter++;
                temp = nums[i];
            }
        }
        for (int i = 0; i < newnums.length; i++) {
            nums[i] = newnums[i];
        }
        return newnums.length;
    }
}
