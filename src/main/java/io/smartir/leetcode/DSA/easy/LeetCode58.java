package io.smartir.leetcode.DSA.easy;

public class LeetCode58 {

    public int lengthOfLastWord(String s) {
        boolean startOver = true;
        int lengthCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isAlphabetic(s.charAt(i))) {
                startOver = true;
                continue;
            }
            if (Character.isAlphabetic(s.charAt(i)) && startOver) {
                lengthCounter = 1;
                startOver = false;
                continue;
            }
            if (Character.isAlphabetic(s.charAt(i)) && !startOver){
                lengthCounter++;
            }
        }
        return lengthCounter;
    }
}
