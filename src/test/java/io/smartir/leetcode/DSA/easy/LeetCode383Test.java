package io.smartir.leetcode.DSA.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode383Test {

    @Test
    public void canConstruct() {
        //given
        LeetCode383 test = new LeetCode383();
        String ransomNote = "a";
        String magazine = "b";
        //when
        var result = test.canConstruct(ransomNote, magazine);
        //then
        assertFalse(result);
    }
    @Test
    public void canConstruct2() {
        //given
        LeetCode383 test = new LeetCode383();
        String ransomNote = "aa";
        String magazine = "ab";
        //when
        var result = test.canConstruct(ransomNote, magazine);
        //then
        assertFalse(result);
    }
    @Test
    public void canConstruct3() {
        //given
        LeetCode383 test = new LeetCode383();
        String ransomNote = "aa";
        String magazine = "aab";
        //when
        var result = test.canConstruct(ransomNote, magazine);
        //then
        assertTrue(result);
    }
}