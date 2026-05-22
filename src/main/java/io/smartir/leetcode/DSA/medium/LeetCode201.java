package io.smartir.leetcode.DSA.medium;

import java.util.Arrays;

public class LeetCode201 {
    int[] bits = new int[32];
    public int rangeBitwiseAnd(int left, int right) {

        int cnt = 0;
        while (left != right) {
            left >>= 1;
            right >>= 1;
            cnt++;
        }
        return (left << cnt);
    }

    private void convertNumToBits(int num){

        String binary = String.format("%32s", Integer.toBinaryString(num)).replace(' ', '0');
        for (int i = 0; i < binary.length(); i++) {
            bits[i] = bits[i] & Integer.parseInt(String.valueOf(binary.charAt(i)));
        }
    }

    private int convertBitsToNumber() {
        int result = 0;
        int degree = 31;
        for (int i = 0; i < bits.length; i++) {
            result += (int) ((bits[i] % 3) * Math.pow(2,degree));
            degree--;
        }
        return result;
    }

}
