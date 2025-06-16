package io.smartir.leetcode.DSA.medium;

public class LeetCode74 {
    public boolean searchMatrix(int[][] matrix, int target) {

        int left = 0, right = matrix[0].length-1, top = 0, bottom = matrix.length-1;
        int row = 0;
        if (matrix.length == 1 && matrix[0].length == 1) return target == matrix[0][0];
        while (top <= bottom) {
            int verticalMid = (top + bottom) / 2;
            if (matrix[verticalMid][0] == target) return true;
            else if (matrix[verticalMid][0] > target) bottom = verticalMid - 1;
            else if (matrix[verticalMid][0] < target) top = verticalMid + 1;
        }
        row = (top + bottom) / 2;
        System.out.println(row);
        while (left <= right) {
            int horizontalMid = (left + right) / 2;
            if (matrix[row][horizontalMid] == target) return true;
            if (matrix[row][horizontalMid] > target) right = horizontalMid - 1;
            else if (matrix[row][horizontalMid] < target) left = horizontalMid + 1;
        }

        return false;
    }
}
