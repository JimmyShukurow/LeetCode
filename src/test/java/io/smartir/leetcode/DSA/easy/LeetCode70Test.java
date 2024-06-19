package io.smartir.leetcode.DSA.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LeetCode70Test {

    @Test
    public void climbStairs() {
        //given
        LeetCode70 leetCode70 = new LeetCode70();

        //when
        var result = leetCode70.climbStairs(4);
        var expected = 5;
        //then
        assertThat(result).isEqualTo(expected);
    }
}