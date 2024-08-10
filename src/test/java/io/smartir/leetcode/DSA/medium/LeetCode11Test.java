package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LeetCode11Test {

    @Test
    public void maxArea() {
        //given
        LeetCode11 test = new LeetCode11();
        int[] given = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        //when
        var result = test.maxArea(given);
        //then
        assertThat(result).isEqualTo(49);
    }
}