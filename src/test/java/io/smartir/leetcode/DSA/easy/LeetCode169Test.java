package io.smartir.leetcode.DSA.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LeetCode169Test {

    @Test
    public void majorityElement() {
        //given
        LeetCode169 test = new LeetCode169();
        int[] given = {3, 2, 3};
        //when
        var result = test.majorityElement(given);
        //then
        assertThat(result).isEqualTo(3);
    }
    @Test
    public void majorityElement2() {
        //given
        LeetCode169 test = new LeetCode169();
        int[] given = {2,2,1,1,1,2,2};
        //when
        var result = test.majorityElement(given);
        //then
        assertThat(result).isEqualTo(2);
    }
}