package io.smartir.leetcode.DSA.easy;

import java.util.HashMap;

public class LeetCode205 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Character> chars = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (chars.containsKey(s.charAt(i)) && t.charAt(i) != chars.get(s.charAt(i))) {
                return false;
            }else {
                chars.put(s.charAt(i), t.charAt(i));
            }
        }
        chars.clear();
        for (int i = 0; i < t.length(); i++) {
            if (chars.containsKey(t.charAt(i)) && s.charAt(i) != chars.get(t.charAt(i))) {
                return false;
            }else {
                chars.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
    }
}
