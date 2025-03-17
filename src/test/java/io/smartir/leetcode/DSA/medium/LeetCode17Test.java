package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode17Test {

    @Test
    void letterCombinations() {
        //given
        LeetCode17 underTest = new LeetCode17();
        String digits = "23";
        //when
        var result = underTest.letterCombinations(digits);
        //then
        System.out.println(result);
    }
    @Test
    void letterCombinations2() {
        //given
        LeetCode17 underTest = new LeetCode17();
        String digits = "";
        //when
        var result = underTest.letterCombinations(digits);
        //then
        System.out.println(result);
    }
    @Test
    void letterCombinations3() {
        //given
        LeetCode17 underTest = new LeetCode17();
        String digits = "2";
        //when
        var result = underTest.letterCombinations(digits);
        //then
        System.out.println(result);
    }
    @Test
    void letterCombinations4() {
        //given
        LeetCode17 underTest = new LeetCode17();
        String digits = "234";
        //when
        var result = underTest.letterCombinations(digits);
        //then
        System.out.println(result);
    }
}