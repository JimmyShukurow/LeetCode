package io.smartir.leetcode.DSA.easy;

import java.util.HashMap;

public class LeetCode13 {
    public static void main(String[] args) {

        System.out.println(romanToInt("XIV"));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> symbols = new HashMap<>();
        symbols.put('I', 1);
        symbols.put('V', 5);
        symbols.put('X', 10);
        symbols.put('L', 50);
        symbols.put('C', 100);
        symbols.put('D', 500);
        symbols.put('M', 1000);

        int counter = s.length() - 1;
        int result = 0;
        while (counter >= 0) {
            if (counter < s.length()-1 && (symbols.get(s.charAt(counter)) < symbols.get(s.charAt(counter + 1)))) {
                result -= symbols.get(s.charAt(counter));
            } else {
                result += symbols.get(s.charAt(counter));
            }
            counter--;
        }
        return result;
    }
}
