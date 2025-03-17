package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode46Test {

    @Test
    void permute() {
        //given
        LeetCode46 underTest = new LeetCode46();
        int[] nums = {1, 2, 3};
        //when
        var result = underTest.permute(nums);
        //then
        System.out.println(result);
    }
}