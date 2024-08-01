package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LeetCode274Test {

    @Test
    public void hIndex() {
        //given
        LeetCode274 test = new LeetCode274();
        int[] given = {3, 0, 6, 1, 5};
        //when
        var result = test.hIndex(given);
        //then
        assertThat(result).isEqualTo(3);
    }
    @Test
    public void hIndex2() {
        //given
        LeetCode274 test = new LeetCode274();
        int[] given = {1,3,1};
        //when
        var result = test.hIndex(given);
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void hIndex3() {
        //given
        LeetCode274 test = new LeetCode274();
        int[] given = new int[1];
        given[0] = 100;
        //when
        var result = test.hIndex(given);
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void hIndex4() {
        //given
        LeetCode274 test = new LeetCode274();
        int[] given = {0,0};

        //when
        var result = test.hIndex(given);
        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void hIndex5() {
        //given
        LeetCode274 test = new LeetCode274();
        int[] given = {11,15};

        //when
        var result = test.hIndex(given);
        //then
        assertThat(result).isEqualTo(2);
    }

}