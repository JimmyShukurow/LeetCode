package io.smartir.leetcode.DSA.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode202Test {

    @Test
    public void isHappy() {
        //given
        LeetCode202 test = new LeetCode202();
        int n = 19;
        //when
        var result = test.isHappy(n);
        //then
        assertTrue(result);
    }
    @Test
    public void isHappy2() {
        //given
        LeetCode202 test = new LeetCode202();
        int n = 2;
        //when
        var result = test.isHappy(n);
        //then
        assertFalse(result);
    }
}