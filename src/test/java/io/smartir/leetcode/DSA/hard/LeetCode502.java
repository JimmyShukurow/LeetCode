package io.smartir.leetcode.DSA.hard;

import org.junit.jupiter.api.Test;

import java.util.*;

public class LeetCode502 {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {

        int n = profits.length;
        int[][] projects = new int[n][2];
        for (int i = 0; i < n; i++) {
            projects[i][0] = capital[i];
            projects[i][1] = profits[i];
        }
        Arrays.sort(projects, (a, b) -> Integer.compare(a[0], b[0]));
        int i = 0;
        PriorityQueue<Integer> maximizeCapital = new PriorityQueue<>(Collections.reverseOrder());
        while (k-- > 0) {
            while (i < n && projects[i][0] <= w) {
                maximizeCapital.offer(projects[i][1]);
                i++;
            }
            if (maximizeCapital.isEmpty()) {
                break;
            }
            w += maximizeCapital.poll();
        }
        return w;
    }

    @Test
    void findMaxCapital() {
        //given
        LeetCode502 underTest = new LeetCode502();
        int k = 2, w = 0;
        int[] profits = {1, 2, 3}, capital = {0, 1, 1};
        //when
        var result = underTest.findMaximizedCapital(k, w, profits, capital);
        // then
        System.out.println(result);

    }

    @Test
    void findMaxCapital2() {
        //given
        LeetCode502 underTest = new LeetCode502();
        int k = 3, w = 0;
        int[] profits = {1, 2, 3}, capital = {0, 1, 2};
        //when
        var result = underTest.findMaximizedCapital(k, w, profits, capital);
        // then
        System.out.println(result);

    }

    @Test
    void findMaxCapital3() {
        //given
        LeetCode502 underTest = new LeetCode502();
        int k = 10, w = 0;
        int[] profits = {1, 2, 3}, capital = {0, 1, 2};
        //when
        var result = underTest.findMaximizedCapital(k, w, profits, capital);
        // then
        System.out.println(result);

    }

}
