package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LeetCode3208Test {

    @Test
    void numberOfAlternatingGroups() {
        //given
        LeetCode3208 underTest = new LeetCode3208();
        int[] colors = {0, 1, 0, 1, 0};
        int k = 3;
        //when
        var result = underTest.numberOfAlternatingGroups(colors, k);
        //then
        assertThat(result).isEqualTo(3);
    }
}