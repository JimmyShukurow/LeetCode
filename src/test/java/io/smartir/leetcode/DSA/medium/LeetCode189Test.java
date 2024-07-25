package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


import static org.junit.jupiter.api.Assertions.*;

class LeetCode189Test {

    @Test
    public void rotate() {
        //given
        LeetCode189 test = new LeetCode189();
        int[] given = {1, 2, 3, 4, 5, 6};
        //when
      test.rotate(given, 3);
        //then
    }

    @Test
    public void rotate2() {
        //given
        LeetCode189 test = new LeetCode189();
        int[] given = {1, 2, 3};
        //when
        test.rotate(given, 4);
        //then
    }
}