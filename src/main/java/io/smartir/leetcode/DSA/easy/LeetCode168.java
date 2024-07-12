package io.smartir.leetcode.DSA.easy;

public class LeetCode168 {
    public  String convertToTitle(int columnNumber) {
        String result = "";
        if (columnNumber > 26 && columnNumber%26 ==0) {
            result += convertToTitle(columnNumber / 26-1);
        } else if (columnNumber > 26) {
            result += convertToTitle(columnNumber / 26);
        }

        columnNumber %= 26;
        if(columnNumber ==0) columnNumber=26;
            result += (char) (64+columnNumber);
        return result;
    }

}
