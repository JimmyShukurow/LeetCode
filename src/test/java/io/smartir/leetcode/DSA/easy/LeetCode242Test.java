package io.smartir.leetcode.DSA.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode242Test {

    @Test
    public void isAnagram() {
        //given
        LeetCode242 test = new LeetCode242();
        String s = "anagram";
        String t = "nagaram";
        //when
        var result = test.isAnagram(s, t);
        //then
        assertTrue(result);
    }
    @Test
    public void isAnagram2() {
        //given
        LeetCode242 test = new LeetCode242();
        String s = "rat";
        String t = "car";
        //when
        var result = test.isAnagram(s, t);
        //then
        assertFalse(result);
    }
}