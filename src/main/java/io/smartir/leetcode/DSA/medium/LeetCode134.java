package io.smartir.leetcode.DSA.medium;

import java.util.Arrays;

public class LeetCode134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gases = 0;
        int costs = 0;
        int index = 0;
        int temp = 0;
        for (int i = 0; i < gas.length; i++) {
            gases += gas[i];
            costs += cost[i];
        }
        if (gases < costs) return -1;
        for (int i = 0; i < gas.length; i++) {
            if (gas[i] < cost[i]) continue;
            index = i;
            while ( i < gas.length){
                temp = temp + gas[i] - cost[i];
                if (temp < 0 ) {
                    temp = 0;
                    break;
                }
                i++;
            }
        }

        return index;
    }


}
