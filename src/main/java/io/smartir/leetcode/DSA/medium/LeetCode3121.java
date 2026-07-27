package io.smartir.leetcode.DSA.medium;

import java.util.HashMap;
import java.util.Map;

public class LeetCode3121 {
    public int numberOfSpecialChars(String word) {

        int counter = 0;

        Map<Character, Integer> data = new HashMap<>();
        data.put('a', 0);
        data.put('b', 0);
        data.put('c', 0);

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == 'a') data.put(c, data.get(c) + 1);
            else if (c == 'b') data.put(c, data.get(c) + 1);
            else if (c == 'c') data.put(c, data.get(c) + 1);
            if (c == 'A' && data.get('a') > 0) {
                counter++;
                data.put('a', data.get('a') - 1);
            } else if (c == 'B' && data.get('b') > 0) {
                counter++;
                data.put('b', data.get('b') - 1);
            } else if (c == 'C' && data.get('c') > 0) {
                counter++;
                data.put('c', data.get('c') - 1);
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        LeetCode3121 leetCode3121 = new LeetCode3121();
        String word = "AbBCab";
        System.out.println(leetCode3121.numberOfSpecialChars(word));
    }
}
