package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LeetCode2379Test {

    @Test
    void minimumRecolors() {
        //given
        LeetCode2379 test = new LeetCode2379();
        String block = "WBWBBBW";
        int k = 2;
        //when
        var result = test.minimumRecolors(block, k);
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    void minimumRecolors2() {
        //given
        LeetCode2379 test = new LeetCode2379();
        String block = "WBBWWBBWBW";
        int k = 7;
        //when
        var result = test.minimumRecolors(block, k);
        //then
        assertThat(result).isEqualTo(3);
    }
}