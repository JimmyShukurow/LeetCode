package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode2698Test {
    @Test
    void punishmentNumber() {
        //given
        LeetCode2698 underTest = new LeetCode2698();
        int given = 10;
        //when
        int result = underTest.punishmentNumber(given);
        //then
        assertEquals(182, result);
    }
    @Test
    void punishmentNumber2() {
        //given
        LeetCode2698 underTest = new LeetCode2698();
        int given = 37;
        //when
        int result = underTest.punishmentNumber(given);
        //then
        assertEquals(1478, result);
    }

    @Test
    void punishmentNumber3() {
        //given
        LeetCode2698 underTest = new LeetCode2698();
        int given = 235;
        //when
        int result = underTest.punishmentNumber(given);
        //then
        assertEquals(96559, result);
    }


}