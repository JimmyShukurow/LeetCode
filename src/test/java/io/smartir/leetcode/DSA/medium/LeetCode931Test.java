package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LeetCode931Test {

    @Test
    public void minFallingPathSum() {
        //given
        LeetCode931 test = new LeetCode931();
        int[][] given = {
                {2, 1, 3},
                {6, 5, 4},
                {7, 8, 9}
        };

        //when
        var result = test.minFallingPathSum(given);

        //then
        assertThat(result).isEqualTo(13);
    }

    @Test
    public void minFallingPathSum2() {
        //given
        LeetCode931 test = new LeetCode931();
        int[][] given = {
                {100, -42, -46, -41},
                {31,   97,  10, -10},
                {-58, -51,  82,  89},
                {51,   81,  69, -51}
        };

        //when
        var result = test.minFallingPathSum(given);

        //then
        assertThat(result).isEqualTo(-36);
    }


}