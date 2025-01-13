package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
class LeetCode930Test {

    @Test
    public void numSubarraysWithSum() {
        //given
        LeetCode930 underTest = new LeetCode930();
        int[] nums = {1, 0, 1, 0, 1};
        //when
        var result = underTest.numSubarraysWithSum(nums, 2);
        //then
        assertThat(result).isEqualTo(4);
    }
    @Test
    public void numSubarraysWithSum2() {
        //given
        LeetCode930 underTest = new LeetCode930();
        int[] nums = {0, 0, 0, 0, 0};
        //when
        var result = underTest.numSubarraysWithSum(nums, 0);
        //then
        assertThat(result).isEqualTo(15);
    }
}