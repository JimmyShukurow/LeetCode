package io.smartir.leetcode.DSA.easy;

public class LeetCode28 {
    public static void main(String[] args) {
        System.out.println(strStr("a", "a"));
    }

    public static int strStr(String haystack, String needle) {

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0) && (haystack.length()-i) >= needle.length()) {
                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

}
