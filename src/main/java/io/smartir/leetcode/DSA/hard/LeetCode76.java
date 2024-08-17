package io.smartir.leetcode.DSA.hard;

import java.util.ArrayList;
import java.util.List;

public class LeetCode76 {
    List<Character> charsOfT = new ArrayList<>();
    public String minWindow(String s, String t) {
        fillChars(t);
        int left = 0;
        int right = left + 1;
        for (int i = 0; i < s.length(); i++) {

        }
        return "";
    }

    public void fillChars(String t) {
        for (int i = 0; i < t.length(); i++) {
            charsOfT.add(t.charAt(i));
        }
    }
}
