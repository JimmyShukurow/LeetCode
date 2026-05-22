package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode172Test {

    @Test
    void trailingZeroes() {
        //given
        LeetCode172 underTest = new LeetCode172();
        int n = 30;
        //when
        var result = underTest.trailingZeroes(n);
        //then
        System.out.println(result);
    }

    @Test
    void trailingZeroes2() {
        //given
        LeetCode172 underTest = new LeetCode172();
        int n = 200;
        //when
        var result = underTest.trailingZeroes(n);
        //then
        System.out.println(result);
    }
}