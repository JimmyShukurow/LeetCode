package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode873Test {

    @Test
    void lenLongestFibSubseq() {
        //given
        LeetCode873 test = new LeetCode873();
        int[] given = {1, 2, 3, 4, 5, 6, 7, 8};
        //when
        var result = test.lenLongestFibSubseq(given);
        //then
        assertEquals(5, result);
    }

    @Test
    void lenLongestFibSubseq2() {
        //given
        LeetCode873 test = new LeetCode873();
        int[] given = {1,3,7,11,12,14,18};
        //when
        var result = test.lenLongestFibSubseq(given);
        //then
        assertEquals(3, result);
    }

    @Test
    void lenLongestFibSubseq3() {
        //given
        LeetCode873 test = new LeetCode873();
        int[] given = {2,4,7,8,9,10,14,15,18,23,32,50};
        //when
        var result = test.lenLongestFibSubseq(given);
        //then
        assertEquals(5, result);
    }
}