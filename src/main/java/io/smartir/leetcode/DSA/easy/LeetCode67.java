package io.smartir.leetcode.DSA.easy;

public class LeetCode67 {

    public String addBinary(String a, String b) {
        int first = a.length() - 1, second = b.length() - 1, carryOver = 0;
        StringBuilder builder = new StringBuilder();
        while (first >= 0 && second >= 0) {
            int lineSum = Character.getNumericValue(a.charAt(first)) + Character.getNumericValue(b.charAt(second)) + carryOver;
            if (lineSum == 3) {
                builder.insert(0, "1");
                carryOver = 1;
            } else if (lineSum == 2) {
                builder.insert(0, "0");
                carryOver = 1;
            } else {
                builder.insert(0, lineSum);
                carryOver = 0;
            }
            first--;
            second--;
        }
        while (first >= 0) {
            int lineSum = Character.getNumericValue(a.charAt(first)) + carryOver;
            if (lineSum == 2) {
                builder.insert(0, "0");
                carryOver = 1;
            } else {
                builder.insert(0, lineSum);
                carryOver = 0;
            }
            first--;
        }
        while (second >= 0) {
            int lineSum = Character.getNumericValue(b.charAt(second)) + carryOver;
            if (lineSum == 2) {
                builder.insert(0, "0");
                carryOver = 1;
            } else {
                builder.insert(0, lineSum);
                carryOver = 0;
            }
            second--;
        }
        if (carryOver == 1) builder.insert(0, carryOver);
        return builder.toString();
    }
}
