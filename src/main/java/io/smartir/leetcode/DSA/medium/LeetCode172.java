package io.smartir.leetcode.DSA.medium;

public class LeetCode172 {
    int counterFive = 0;
    int counterTwo = 0;

    public int trailingZeroes(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                counterFive++;
                checkForOtherDivisionsForFive(i / 5);
            }
        }
        return Math.min(counterFive, counterTwo);
    }

    private void checkForOtherDivisionsForFive(int num) {
        if (num < 5 || num % 5 != 0) return;
        counterFive++;
        checkForOtherDivisionsForFive(num / 5);
    }

    private void checkForOtherDivisionsForTwo(int num) {
        if (num % 2 != 0) return;
        counterTwo++;
        checkForOtherDivisionsForTwo(num /2);
    }
}
