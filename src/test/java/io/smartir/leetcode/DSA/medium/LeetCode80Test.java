package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LeetCode80Test {

    @Test
    public void removeDuplicates() {
        //given
        LeetCode80 leetCode80 = new LeetCode80();
        int[] given = {1, 1, 1, 2, 2, 3};
        //when
        var result = leetCode80.removeDuplicates(given);
        //then
        assertThat(result).isEqualTo(new int[]{1, 1, 2, 2, 3, 3});
    }
}