package io.smartir.leetcode.DSA.medium;

public class LeetCode8 {
    public static int myAtoi(String s) {
        s = s.trim();

        if (s.isEmpty()) return 0;

        boolean negative = false;
        int i = 0;

        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            negative = s.charAt(i) == '-';
            i++;
        }

        long result = 0;

        while (i < s.length()) {
            int code = s.charAt(i);

            if (code < '0' || code > '9') break;

            result = result * 10 + (code - '0');

            if (negative && result > 2147483648L) {
                return Integer.MIN_VALUE;
            }

            if (!negative && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            i++;
        }

        return negative ? (int) -result : (int) result;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("  42"));
        System.out.println(myAtoi("  -042"));
        System.out.println(myAtoi("1337c0d3"));
        System.out.println(myAtoi("0-1"));
        System.out.println(myAtoi("words and 987"));
    }

}
