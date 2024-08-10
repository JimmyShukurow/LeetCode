package io.smartir.leetcode.DSA.medium;

import java.util.Map;

public class LeetCode12 {
    private final Map<Integer, String> BASICS = Map.of(
            1, "I",
            5, "V",
            10, "X",
            50, "L",
            100, "C",
            500, "D",
            1000, "M"
    );

    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        int divider = 10;
        int digits = 1;
        while (num > 0) {
            if (BASICS.containsKey((num % divider) * digits)) result.insert(0, BASICS.get((num % divider) * digits));
            result.insert(0, onceDigit(num % divider * digits));
            result.insert(0, tensDigit(num % divider * digits));
            result.insert(0, hundredsDigit(num % divider * digits));
            result.insert(0, thousandsDigit(num % divider * digits));
            num = num / 10;
            digits *= 10;
        }
        return result.toString();
    }

    public String onceDigit(int currentDigit) {
        if (currentDigit == 1) return "";
        StringBuilder currentResult = new StringBuilder();
        if (currentDigit == 4) currentResult.append(BASICS.get(1)).append(BASICS.get(5));
        if (currentDigit == 9) currentResult.append(BASICS.get(1)).append(BASICS.get(10));
        if (currentDigit < 4) {
            while (currentDigit > 0) {
                currentResult.append(BASICS.get(1));
                currentDigit--;
            }
        }
        if (currentDigit < 9 && currentDigit > 5) {
            currentResult.append(BASICS.get(5));
            while (currentDigit > 5) {
                currentResult.append(BASICS.get(1));
                currentDigit--;
            }
        }
        return currentResult.toString();
    }

    public String tensDigit(int currentDigit) {
        if (currentDigit == 10) return "";
        StringBuilder currentResult = new StringBuilder();
        if (currentDigit == 40) currentResult.append(BASICS.get(10)).append(BASICS.get(50));
        if (currentDigit == 90) currentResult.append(BASICS.get(10)).append(BASICS.get(100));
        if (currentDigit < 40 && currentDigit > 10) {
            while (currentDigit > 0) {
                currentResult.append(BASICS.get(10));
                currentDigit -= 10;
            }
        }
        if (currentDigit < 90 && currentDigit > 50) {
            currentResult.append(BASICS.get(50));
            while (currentDigit > 50) {
                currentResult.append(BASICS.get(10));
                currentDigit -= 10;
            }
        }
        return currentResult.toString();
    }

    public String hundredsDigit(int currentDigit) {
        if (currentDigit == 100) return "";
        StringBuilder currentResult = new StringBuilder();
        if (currentDigit == 400) currentResult.append(BASICS.get(100)).append(BASICS.get(500));
        if (currentDigit == 900) currentResult.append(BASICS.get(100)).append(BASICS.get(1000));
        if (currentDigit < 400 && currentDigit > 100) {
            while (currentDigit > 0) {
                currentResult.append(BASICS.get(100));
                currentDigit -= 100;
            }
        }
        if (currentDigit < 900 && currentDigit > 500) {
            currentResult.append(BASICS.get(500));
            while (currentDigit > 500) {
                currentResult.append(BASICS.get(100));
                currentDigit -= 100;
            }
        }
        return currentResult.toString();
    }

    public String thousandsDigit(int currentDigit) {
        if (currentDigit == 1000) return "";
        StringBuilder currentResult = new StringBuilder();
        while (currentDigit >= 1000) {
            currentResult.append(BASICS.get(1000));
            currentDigit -= 1000;
        }
        return currentResult.toString();
    }
}
