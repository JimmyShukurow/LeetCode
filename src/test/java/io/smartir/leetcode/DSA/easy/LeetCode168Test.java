package io.smartir.leetcode.DSA.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LeetCode168Test {

    @Test
    public void convertToTitle() {
        //given
        LeetCode168 test = new LeetCode168();

        //when
        var result = test.convertToTitle(1);
        //then
        assertThat(result).isEqualTo("A");
    }
    @Test
    public void convertToTitle2() {
        //given
        LeetCode168 test = new LeetCode168();

        //when
        var result = test.convertToTitle(28);
        //then
        assertThat(result).isEqualTo("AB");
    }
    @Test
    public void convertToTitle3() {
        //given
        LeetCode168 test = new LeetCode168();

        //when
        var result = test.convertToTitle(701);
        //then
        assertThat(result).isEqualTo("ZY");
    }
    @Test
    public void convertToTitle4() {
        //given
        LeetCode168 test = new LeetCode168();

        //when
        var result = test.convertToTitle(2147483647);
        //then
        assertThat(result).isEqualTo("FXSHRXW");
    }
    @Test
    public void convertToTitle5() {
        //given
        LeetCode168 test = new LeetCode168();

        //when
        var result = test.convertToTitle(52);
        //then
        assertThat(result).isEqualTo("AZ");
    }

}