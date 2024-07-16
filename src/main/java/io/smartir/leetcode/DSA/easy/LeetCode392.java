package io.smartir.leetcode.DSA.easy;

public class LeetCode392 {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty() ) return true;
        if (t.isEmpty()) return false;
        int pointer = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(pointer)) {
                pointer++;
                if (pointer == s.length()) return true;
            }
        }
        return false ;
    }
}
