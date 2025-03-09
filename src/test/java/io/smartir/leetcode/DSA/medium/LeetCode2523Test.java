package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LeetCode2523Test {

    @Test
    void closestPrimes() {
        //given
        LeetCode2523 test = new LeetCode2523();
        int left = 10;
        int right = 19;
        //when
        var result = test.closestPrimes(left, right);
        //then
        assertThat(result[0]).isEqualTo(11);
        assertThat(result[1]).isEqualTo(13);
    }
    @Test
    void closestPrimes2() {
        //given
        LeetCode2523 test = new LeetCode2523();
        int left = 4;
        int right = 6;
        //when
        var result = test.closestPrimes(left, right);
        //then
        assertThat(result[0]).isEqualTo(-1);
        assertThat(result[1]).isEqualTo(-1);
    }
}