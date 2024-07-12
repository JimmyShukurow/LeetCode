package io.smartir.leetcode.DSA.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class LeetCode136Test {

    @Test
    public void singleNumber() {
        //given
        LeetCode136 test = new LeetCode136();
        int[] given = {2,2,1};
        //when
        int result = test.singleNumber(given);
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void singleNumber2() {
        //given
        LeetCode136 test = new LeetCode136();
        int[] given = {4,1,2,1,2};
        //when
        int result = test.singleNumber(given);
        //then
        assertThat(result).isEqualTo(4);

    }

}