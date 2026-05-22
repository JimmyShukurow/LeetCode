package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode201Test {

    @Test
    void rangeBitwiseAnd() {
        //given
        LeetCode201 underTest = new LeetCode201();
        int left = 1, right = 2147483647;
        //when
        var resutl = underTest.rangeBitwiseAnd(left, right);
        //then
        System.out.println(resutl);
    }
}