package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LeetCode224Test {

    @Test
    void calculate() {
        //given
        LeetCode224 underTest = new LeetCode224();
        String given = "1 + 1";
        //when
        int result = underTest.calculate(given);
        //then
        assertThat(result).isEqualTo(2);
    }
    @Test
    void calculate2() {
        //given
        LeetCode224 underTest = new LeetCode224();
        String given = " 2-1 + 2 ";
        //when
        int result = underTest.calculate(given);
        //then
        assertThat(result).isEqualTo(3);
    }
    @Test
    void calculate3() {
        //given
        LeetCode224 underTest = new LeetCode224();
        String given = "(1+(4+5+2)-3)+(6+8)";
        //when
        int result = underTest.calculate(given);
        //then
        assertThat(result).isEqualTo(23);
    }
    @Test
    void calculate4() {
        //given
        LeetCode224 underTest = new LeetCode224();
        String given = "-2+ 1";
        //when
        int result = underTest.calculate(given);
        //then
        assertThat(result).isEqualTo(-1);
    }

}