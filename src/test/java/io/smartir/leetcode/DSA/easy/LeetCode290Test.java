package io.smartir.leetcode.DSA.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode290Test {

    @Test
    public void wordPattern() {
        //given
        LeetCode290 test = new LeetCode290();
        String pattern = "abba";
        String s = "dog cat cat dog";
        //when
        var result = test.wordPattern(pattern, s);
        //then
        assertTrue(result);
    }

    @Test
    public void wordPattern2() {
        //given
        LeetCode290 test = new LeetCode290();
        String pattern = "abba";
        String s = "dog cat cat fish";
        var result = test.wordPattern(pattern, s);
        //then
        assertFalse(result);
    }
    @Test
    public void wordPattern3() {
        //given
        LeetCode290 test = new LeetCode290();
        String pattern = "aaaa";
        String s = "dog cat cat dog";
        var result = test.wordPattern(pattern, s);
        //then
        assertFalse(result);
    }
}