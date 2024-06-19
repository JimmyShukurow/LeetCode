package io.smartir.leetcode.DSA.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LeetCode66Test {

    @Test
    public void plusOne() {
        //given
        LeetCode66 leetCode66 = new LeetCode66();
        //when
        var result = leetCode66.plusOne(new int[]{1,2,3});
        System.out.println(Arrays.toString(result));
        var expected = new int[]{1, 2, 4};

        //then
        assertThat(result).isEqualTo(expected);
    }
}