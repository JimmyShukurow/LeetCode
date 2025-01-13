package io.smartir.leetcode.DSA.easy;

import java.util.HashMap;
import java.util.Map;

public class LeetCode409 {
    public int longestPalindrome(String s) {
        if(s.length() == 1) return 1;
        Map<Character, Integer> chars = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            chars.put(s.charAt(i), chars.getOrDefault(s.charAt(i),0)+1);
        }
        int counter = 0;
        for(Map.Entry<Character,Integer> entry : chars.entrySet()){
            counter += entry.getValue()/2;
        }
        if(counter*2 < s.length()) return counter*2+1;
        return counter*2;
    }
}
