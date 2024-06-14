package io.smartir.leetcode.DSA.easy;

import java.util.LinkedList;

public class LeetCode20 {
    public static void main(String[] args) {
        System.out.println(isValid(")(){}"));
    }
    public static boolean isValid(String s) {
        LinkedList<Character> parentheses = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ')' && !parentheses.isEmpty() && parentheses.peekLast() == '(') {
                parentheses.pollLast();
                continue;
            }
            if(s.charAt(i) == '}' && !parentheses.isEmpty() && parentheses.peekLast() == '{'){
                parentheses.pollLast();
                continue;
            }

            if(s.charAt(i) == ']' && !parentheses.isEmpty() && parentheses.peekLast() == '[') {
                parentheses.pollLast();
                continue;
            }
            parentheses.add(s.charAt(i));
        }
        return parentheses.isEmpty();
    }
}
