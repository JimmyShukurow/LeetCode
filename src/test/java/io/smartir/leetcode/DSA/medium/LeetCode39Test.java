package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode39Test {

    @Test
    void combinationSum() {
        //given
        LeetCode39 underTest = new LeetCode39();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        //when
        var result = underTest.combinationSum(candidates, target);
        //then
        System.out.println(result);
    }
}