package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode433Test {

    @Test
    void minMutation() {
        //given
        LeetCode433 test = new LeetCode433();
        String start = "AACCGGTT";
        String end = "AACCGGTA";
        String[] bank = {"AACCGGTA"};
        //when
        var result = test.minMutation(start, end, bank);
        //then
        assertEquals(1, result);
    }
}