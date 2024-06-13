package io.smartir.leetcode.DSA.easy;

public class LeetCode9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1234567899));
    }

    public static boolean isPalindrome(int x) {

        if(x<10 && x>=0) return true;
        long moder = 10;
        long divider = 1;
        long result = 0;
        while (x > moder/10) {
            result = 10 * result + (x % moder) / divider;
            moder *= 10;
            divider *= 10;
        }
        return result == x;
    }
}
