package io.smartir.leetcode.DSA.medium;

public class LeetCode5 {
    public String longestPalindrome(String s) {
        String result = String.valueOf(s.charAt(0));
        if (s.length() == 1) return s;
        if (s.length() == 2 && s.charAt(0) == s.charAt(1)) return s;
        else if (s.length() == 2) return s.substring(0, 1);
        for (int i = 0; i < s.length() - 1; i++) {
            if (i > 0) {
                if (s.charAt(i - 1) == s.charAt(i + 1)) {
                    String temp = checkSidesWhenCenter(s, i);
                    if (temp.length() > result.length()) result = temp;
                }
                if (s.charAt(i) == s.charAt(i + 1)) {
                    String temp = checkSidesWhenOneSide(s, i);
                    if (temp.length() > result.length()) result = temp;
                }
                if (s.charAt(i - 1) == s.charAt(i)) {
                    String temp = checkSidesWhenOneSide(s, i - 1);
                    if (temp.length() > result.length()) result = temp;
                }
            }
        }
        return result;
    }

    public String checkSidesWhenCenter(String given, int targetPoint) {
        int i = targetPoint - 1;
        int j = targetPoint + 1;
        String s = String.valueOf(given.charAt(targetPoint));
        while (i >= 0 && j < given.length()) {
            if (given.charAt(i) == given.charAt(j)) {
                s = given.charAt(i) + s + given.charAt(j);
                i--;
                j++;
            } else break;
        }
        return s;
    }

    public String checkSidesWhenOneSide(String given, int targetPoint) {
        int i = targetPoint;
        int j = targetPoint + 1;
        String s = "";
        while ((i >= 0 && j < given.length())) {
            if (given.charAt(i) == given.charAt(j)) {
                s = given.charAt(i) + s + given.charAt(j);
                i--;
                j++;
            } else break;
        }
        return s;
    }

}

