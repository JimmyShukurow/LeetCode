package io.smartir.leetcode.DSA.hard;

public class LeetCode188 {
    static int solveTab(int[] prices,int k){
        int n=prices.length;

        int [][] curr = new int[2][k+2];
        int [][] next = new int[2][k+2];

        for(int index=n-1;index>=0;index--){
            for(int buy=1;buy>=0;buy--){
                for(int limit=1;limit<=k;limit++){
                    int profit=0;
                    if(buy==1){
                        int salekaro=prices[index]+next[0][limit-1];
                        int skipkaro=0+next[1][limit];
                        profit+=Math.max(salekaro,skipkaro);
                    }
                    else{
                        int buykaro=-prices[index]+next[1][limit];
                        int skipkaro=0+next[0][limit];
                        profit+=Math.max(buykaro,skipkaro);
                    }
                    curr[buy][limit]=profit;
                }
            }
            next=curr;
        }
        return next[0][k];
    }
    public int maxProfit(int k, int[] prices) {
        return solveTab(prices,k);
    }

    public static void main(String[] args) {
        LeetCode188 leetCode188 = new LeetCode188();
        int[] prices = {2,4,1};
        System.out.println(leetCode188.maxProfit(2, prices));
    }
}
