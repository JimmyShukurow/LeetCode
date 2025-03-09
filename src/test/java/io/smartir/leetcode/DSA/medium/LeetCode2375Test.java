package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LeetCode2375Test {

    @Test
    void smallestNumber() {
        //given
        LeetCode2375 underTest = new LeetCode2375();
        String pattern = "IIIDIDDD";
        //when
        String resul = underTest.smallestNumber(pattern);
        //then
        assertThat(resul).isEqualTo("123549876");
    }
    @Test
    void smallestNumber2() {
        //given
        LeetCode2375 underTest = new LeetCode2375();
        String pattern = "DDD";
        //when
        String resul = underTest.smallestNumber(pattern);
        //then
        assertThat(resul).isEqualTo("4321");
    }
}