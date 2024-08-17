package io.smartir.leetcode.DSA.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode228Test {

    @Test
    public void summaryRanges() {
        //given
        LeetCode228 test = new LeetCode228();
        int[] given = {0, 1, 2, 4, 5, 7};
        //when
        var result = test.summaryRanges(given);
        //then
        System.out.println(result);
    }
    @Test
    public void summaryRanges2() {
        //given
        LeetCode228 test = new LeetCode228();
        int[] given = {0,2,3,4,6,8,9};
        //when
        var result = test.summaryRanges(given);
        //then
        System.out.println(result);
    }
}