package io.smartir.leetcode.DSA.easy;

import java.util.HashMap;
import java.util.Map;

public class LeetCode383 {
    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> chars = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            chars.put(magazine.charAt(i), chars.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (!chars.containsKey(ransomNote.charAt(i))) return false;
            int count = chars.get(ransomNote.charAt(i)) - 1;
            if (count == 0) chars.remove(ransomNote.charAt(i));
            else chars.put(ransomNote.charAt(i), count);
        }
        return true;
    }
}
