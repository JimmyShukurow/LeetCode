package io.smartir.leetcode.DSA.easy;

import java.util.HashMap;
import java.util.Map;

public class LeetCode290 {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;
        for (int i = 0; i < pattern.length(); i++) {
            if (charToWord.containsKey(pattern.charAt(i)) && !words[i].equals(charToWord.get(pattern.charAt(i)))) {
                return false;
            } else {
                charToWord.put(pattern.charAt(i), words[i]);
            }
        }
        for (int i = 0; i < pattern.length(); i++) {
            if (wordToChar.containsKey(words[i]) && pattern.charAt(i) != wordToChar.get(words[i])) {
                return false;
            } else {
                wordToChar.put(words[i], pattern.charAt(i));
            }
        }
        return true;
    }
}
