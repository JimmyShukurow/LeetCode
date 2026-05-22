package io.smartir.leetcode.DSA.medium;

public class LeetCode50 {
    Double base = null;

    public double myPow(double x, int n) {

        long N = n;

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return fastPow(x, N);
    }

    private double fastPow(double x, long n) {

        if (n == 0) return 1;

        double half = fastPow(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public static void main(String[] args) {
        LeetCode50 underTest = new LeetCode50();
        System.out.println(underTest.myPow(2.0000, -200000000));
    }

}
