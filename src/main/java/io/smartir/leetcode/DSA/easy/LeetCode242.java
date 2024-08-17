package io.smartir.leetcode.DSA.easy;

import java.util.HashMap;

public class LeetCode242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> chars = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            chars.put(s.charAt(i), chars.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            if (!chars.containsKey(t.charAt(i))) return false;
            if (chars.get(t.charAt(i)) <= 0) return false;
            chars.put(t.charAt(i), chars.get(t.charAt(i)) - 1);
        }
        return true;
    }
}
