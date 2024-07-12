package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LeetCode3Test {

    @Test
    public void lengthOfLongestSubstring() {
        //given
        LeetCode3 test = new LeetCode3();
        String given = "abcabcbb";
        //when
        var result = test.lengthOfLongestSubstring(given);
        //then
        assertThat(result).isEqualTo(3);
    }
    @Test
    public void lengthOfLongestSubstring2() {
        //given
        LeetCode3 test = new LeetCode3();
        String given = " ";
        //when
        var result = test.lengthOfLongestSubstring(given);
        //then
        assertThat(result).isEqualTo(1);
    }
    @Test
    public void lengthOfLongestSubstring3() {
        //given
        LeetCode3 test = new LeetCode3();
        String given = "au";
        //when
        var result = test.lengthOfLongestSubstring(given);
        //then
        assertThat(result).isEqualTo(2);
    }
    @Test
    public void lengthOfLongestSubstring4() {
        //given
        LeetCode3 test = new LeetCode3();
        String given = "cdd";
        //when
        var result = test.lengthOfLongestSubstring(given);
        //then
        assertThat(result).isEqualTo(2);
    }
    @Test
    public void lengthOfLongestSubstring5() {
        //given
        LeetCode3 test = new LeetCode3();
        String given = "dvdf";
        //when
        var result = test.lengthOfLongestSubstring(given);
        //then
        assertThat(result).isEqualTo(3);
    }
    @Test
    public void lengthOfLongestSubstring6() {
        //given
        LeetCode3 test = new LeetCode3();
        String given = "abba";
        //when
        var result = test.lengthOfLongestSubstring(given);
        //then
        assertThat(result).isEqualTo(2);
    }
    @Test
    public void lengthOfLongestSubstring7() {
        //given
        LeetCode3 test = new LeetCode3();
        String given = "bbbbb";
        //when
        var result = test.lengthOfLongestSubstring(given);
        //then
        assertThat(result).isEqualTo(1);
    }
}