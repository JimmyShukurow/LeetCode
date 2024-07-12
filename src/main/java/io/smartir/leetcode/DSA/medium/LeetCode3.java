package io.smartir.leetcode.DSA.medium;

import java.util.ArrayList;
import java.util.List;

public class LeetCode3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) return 1;
        int maxLength = 0;
        int length = 0;
        int lastRepeating = 0;
        List<Character> charsFromString = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (charsFromString.contains(s.charAt(i))) {
                lastRepeating = Math.max(lastRepeating, charsFromString.lastIndexOf(s.charAt(i)));
                if (length>maxLength) maxLength = length;
                length = i-lastRepeating-1;
            }
            charsFromString.add(s.charAt(i));
            length++;

        }
        return Math.max(maxLength, length);
    }

}
