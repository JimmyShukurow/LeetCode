package io.smartir.leetcode.DSA.medium;

public class LeetCode221 {
    int sideLength = 0;
    int maxSideLength = 0;

    public int maximalSquare(char[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    sideLength = 1;
                    maxSideLength = Math.max(sideLength, maxSideLength);
                    helper(i, j, matrix);
                }
                sideLength = 0;
            }
        }
        return maxSideLength * maxSideLength;
    }

    public void helper(int i, int j, char[][] matrix) {

        int bottomRow = i + sideLength;
        int rightCol = j + sideLength;

        if (bottomRow >= matrix.length || rightCol >= matrix[0].length)
            return;

        for (int col = j; col <= rightCol; col++) {
            if (matrix[bottomRow][col] == '0')
                return;
        }

        for (int row = i; row <= bottomRow; row++) {
            if (matrix[row][rightCol] == '0')
                return;
        }

        sideLength++;
        maxSideLength = Math.max(maxSideLength, sideLength);

        helper(i, j, matrix);
    }

    public static void main(String[] args) {
        LeetCode221 leetCode221 = new LeetCode221();
//        char[][] matrix = {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        char[][] matrix = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '1', '1', '0'},
                {'1', '1', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'0', '0', '1', '1', '1'}
        };
        System.out.println(leetCode221.maximalSquare(matrix));
    }
}
