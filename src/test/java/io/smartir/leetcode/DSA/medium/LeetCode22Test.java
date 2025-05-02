package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode22Test {

    @Test
    void generateParenthesis() {
        //given
        LeetCode22 underTest = new LeetCode22();
        int given = 3;
        //when
        var result = underTest.generateParenthesis(given);
        //then
        System.out.println(result);
    }
}