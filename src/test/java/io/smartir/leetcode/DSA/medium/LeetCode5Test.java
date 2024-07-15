package io.smartir.leetcode.DSA.medium;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode5Test {

    @Test
    public void longestPalindrome() {
        //given
        LeetCode5 test = new LeetCode5();
        String given = "babad";
        //when
        var result = test.longestPalindrome(given);
        //then
        assertThat(result).isEqualTo("bab");
    }
    @Test
    public void longestPalindrome2() {
        //given
        LeetCode5 test = new LeetCode5();
        String given = "ccc";
        //when
        var result = test.longestPalindrome(given);
        //then
        assertThat(result).isEqualTo("ccc");
    }
    @Test
    public void longestPalindrome3() {
        //given
        LeetCode5 test = new LeetCode5();
        String given = "cbbd";
        //when
        var result = test.longestPalindrome(given);
        //then
        assertThat(result).isEqualTo("bb");
    }
    @Test
    public void longestPalindrome4() {
        //given
        LeetCode5 test = new LeetCode5();
        String given = "abcda";
        //when
        var result = test.longestPalindrome(given);
        //then
        assertThat(result).isEqualTo("a");
    }

}