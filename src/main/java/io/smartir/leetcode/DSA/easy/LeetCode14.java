package io.smartir.leetcode.DSA.easy;

import java.util.ArrayList;
import java.util.List;

public class LeetCode14 {
    public static void main(String[] args) {
        System.out.println(compareTwoStrings("flower", "flow"));
        System.out.println(longestCommonPrefix(new String[]{"abab", "aba", "abc"}));
        StringBuilder builder = new StringBuilder();
        List<String> words = new ArrayList<>();
        words.forEach(builder::append);
    }

    public static String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String comparedStrings = compareTwoStrings(strs[0], strs[i]);
            result = result.length() > comparedStrings.length() ? comparedStrings : result;
        }
        return result;
    }

    public static String compareTwoStrings(String given1, String given2) {
        String result = "";
        StringBuilder builder = new StringBuilder();
        if (given1 == "" || given2 == "") return "";

        for (int i = 0; i < given1.length(); i++) {
            for (int j = 0; j < given2.length(); j++) {
                if (given1.charAt(i) == given2.charAt(j)) {
                    builder.append(given1.charAt(i));
                    if (i < given1.length() - 1) i++;
                } else {
                    builder = new StringBuilder();
                }
                if (builder.length() > result.length() && given1.startsWith(builder.toString()) && given2.startsWith(builder.toString())) {
                    result = builder.toString();
                }
            }
        }
        return result;
    }
}
