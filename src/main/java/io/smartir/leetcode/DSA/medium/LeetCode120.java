package io.smartir.leetcode.DSA.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode120 {
    int[] dp;

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();

        dp = new int[n];

        // store last row in dp
        for (int j = 0; j < n; j++) {
            dp[j] = triangle.get(n - 1).get(j);
        }

        solve(n - 2, triangle);

        return dp[0];
    }

    public void solve(int i, List<List<Integer>> triangle) {
        if (i < 0) return;

        for (int j = 0; j <= i; j++) {
            dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
        }

        solve(i - 1, triangle);
    }

    public static void main(String[] args) {
        LeetCode120 test = new LeetCode120();
        List<List<Integer>> triangle = List.of(
                List.of(2),
                List.of(3, 4),
                List.of(6, 5, 9),
                List.of(4, 4, 8, 0)
        );
        System.out.println(test.minimumTotal(triangle));
    }

    }
