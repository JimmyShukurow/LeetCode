package io.smartir.leetcode.DSA.easy;

public class LeetCode121 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            int diff = prices[i] - min;
            if (diff > maxProfit) maxProfit = diff;
            if (prices[i] < min) min = prices[i];
        }
        return maxProfit;
    }
}
