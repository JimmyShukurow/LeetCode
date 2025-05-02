package io.smartir.leetcode.DSA.medium;

import java.util.ArrayList;
import java.util.List;

public class LeetCode52 {
    int solutionCount = 0;
    List<Integer> hor = new ArrayList<>();
    List<Integer> ver = new ArrayList<>();
    List<Integer> rightDiog = new ArrayList<>();
    List<Integer> leftDiog = new ArrayList<>();

    public int totalNQueens(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                hor.add(i);
                ver.add(j);
                rightDiog.add(i + j);
                leftDiog.add(i - j);
                backtrack(n, i,n - 1);
                hor = new ArrayList<>();
                ver = new ArrayList<>();
                rightDiog = new ArrayList<>();
                leftDiog = new ArrayList<>();
            }
        }
        return solutionCount;
    }

    private void backtrack(int dimension,int i,  int n) {

        if (n == 0) {
            solutionCount++;
            return;

        }
        for (int k = i; k < dimension; k++) {
            for (int l = 0; l < dimension; l++) {
                if (!hor.contains(k) && !ver.contains(l) && !rightDiog.contains(k + l) && !leftDiog.contains(k - l) ) {
                    hor.add(k);
                    ver.add(l);
                    rightDiog.add(k + l);
                    leftDiog.add(k - l);
                    backtrack(dimension, k,n - 1);
                    hor.remove(hor.size() - 1);
                    ver.remove(ver.size() - 1);
                    rightDiog.remove(rightDiog.size() - 1);
                    leftDiog.remove(leftDiog.size() - 1);
                }
            }
        }
    }
}
