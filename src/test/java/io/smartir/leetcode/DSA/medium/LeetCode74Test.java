package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode74Test {

    @Test
    void searchMatrix() {
        //given
        LeetCode74 undertest = new LeetCode74();
        int target = 11;
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        //when
        var result = undertest.searchMatrix(matrix, target);
        //then
        System.out.println(result);
    }
}