package io.smartir.leetcode.DSA.medium;

import java.util.Arrays;

public class LeetCode274 {
    public int hIndex(int[] citations) {
        for (int i = 0; i < citations.length; i++) {
            for (int j = i; j < citations.length; j++) {
                int temp = citations[j];
                if (citations[i] < citations[j]) {
                    citations[j] = citations[i];
                    citations[i] = temp;
                }
            }
        }
        int result = 0;
        for (int i = 0; i < citations.length; i++) {
            if (citations[i]>= i+1) result++;
        }
        System.out.println(Arrays.toString(citations));
        return result;
    }
}
