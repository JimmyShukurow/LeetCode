package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LeetCode1780Test {

    @Test
    void checkPowersOfThree() {
        //given
        LeetCode1780 test = new LeetCode1780();
        int given = 12;
        //when
        var result = test.checkPowersOfThree(given);
        //then
        assertTrue(result);
    }
    @Test
    void checkPowersOfThree2() {
        //given
        LeetCode1780 test = new LeetCode1780();
        int given = 91;
        //when
        var result = test.checkPowersOfThree(given);
        //then
        assertTrue(result);
    }
    @Test
    void checkPowersOfThree3() {
        //given
        LeetCode1780 test = new LeetCode1780();
        int given = 21;
        //when
        var result = test.checkPowersOfThree(given);
        //then
        assertFalse(result);
    }
}