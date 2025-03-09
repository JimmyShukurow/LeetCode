package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LeetCode1749Test {

    @Test
    void maxAbsoluteSum() {
        //when
        LeetCode1749 underTest = new LeetCode1749();
        int[] given = {1, -3, 2, 3, -4};
        //when
        int result = underTest.maxAbsoluteSum(given);
        //then
        assertThat(result).isEqualTo(5);
    }
    @Test
    void maxAbsoluteSum2() {
        //when
        LeetCode1749 underTest = new LeetCode1749();
        int[] given = {2,-5,1,-4,3,-2};
        //when
        int result = underTest.maxAbsoluteSum(given);
        //then
        assertThat(result).isEqualTo(8);
    }
}