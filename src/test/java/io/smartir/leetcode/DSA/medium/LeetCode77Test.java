package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode77Test {

    @Test
    void combine() {
        //given
        LeetCode77 underTest = new LeetCode77();
        int n = 4;
        int k = 2;
        //when
        var underTestResult = underTest.combine(n, k);
        //then
        System.out.println(underTestResult);
    }
}