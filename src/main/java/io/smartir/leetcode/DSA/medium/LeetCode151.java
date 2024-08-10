package io.smartir.leetcode.DSA.medium;

public class LeetCode151 {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder currWord = new StringBuilder();
        for (int i = 0; i < s.length() ; i++) {
            if (Character.isLetterOrDigit(s.charAt(i))){
                currWord.append(s.charAt(i));
            }else if(!currWord.isEmpty()) {
                if (result.isEmpty())result.insert(0, currWord);
                else result.insert(0, currWord + " ");
                currWord = new StringBuilder();
            }
        }
        if(!currWord.isEmpty()) {
            if (result.isEmpty())result.insert(0, currWord);
            else result.insert(0, currWord + " ");
        }
        return result.toString();
    }
}
