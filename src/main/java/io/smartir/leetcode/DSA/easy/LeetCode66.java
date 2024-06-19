package io.smartir.leetcode.DSA.easy;

public class LeetCode66 {
    public int[] plusOne(int[] digits) {
        int[] newDigits = new int[digits.length+1];
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 9) {
                newDigits = new int[digits.length];
                break;
            }
        }
        int breakPoint = digits.length-1;
        for (int i = digits.length-1; i >= 0; i--) {
           if (digits[i] ==9) {
               newDigits[i] = 0;
           }
           else {
               newDigits[i] = digits[i]+1;
               breakPoint = i;
               break;
           }
        }

        if (newDigits.length > digits.length) newDigits[0] = 1;
        else {
            for (int i = breakPoint-1; i >= 0; i--) {
                newDigits[i] = digits[i];
            }
        }
        return newDigits;
    }
}
