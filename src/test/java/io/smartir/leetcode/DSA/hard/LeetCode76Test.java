package io.smartir.leetcode.DSA.hard;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LeetCode76Test {

    @Test
    public void minWindow() {
        //given
        LeetCode76 test = new LeetCode76();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        //when
        var result = test.minWindow(s, t);
        //then
        assertThat(result).isEqualTo("BANC");
    }
    @Test
    public void minWindow2() {
        //given
        LeetCode76 test = new LeetCode76();
        String s = "a";
        String t = "a";
        //when
        var result = test.minWindow(s, t);
        //then
        assertThat(result).isEqualTo("a");
    }
    @Test
    public void minWindow3() {
        //given
        LeetCode76 test = new LeetCode76();
        String s = "a";
        String t = "aa";
        //when
        var result = test.minWindow(s, t);
        //then
        assertThat(result).isEqualTo("");
    }
    @Test
    public void minWindow4() {
        //given
        LeetCode76 test = new LeetCode76();
        String s = "ab";
        String t = "a";
        //when
        var result = test.minWindow(s, t);
        //then
        assertThat(result).isEqualTo("a");
    }
    @Test
    public void minWindow5() {
        //given
        LeetCode76 test = new LeetCode76();
        String s = "abc";
        String t = "ac";
        //when
        var result = test.minWindow(s, t);
        //then
        assertThat(result).isEqualTo("abc");
    }
    @Test
    public void minWindow6() {
        //given
        LeetCode76 test = new LeetCode76();
        String s = "abc";
        String t = "cba";
        //when
        var result = test.minWindow(s, t);
        //then
        assertThat(result).isEqualTo("abc");
    }
    @Test
    public void minWindow8() {
        //given
        LeetCode76 test = new LeetCode76();
        String s = "bba";
        String t = "ba";
        //when
        var result = test.minWindow(s, t);
        //then
        assertThat(result).isEqualTo("ba");
    }
    @Test
    public void minWindow7() {
        //given
        LeetCode76 test = new LeetCode76();
        String s = "a";
        String t = "b";
        //when
        var result = test.minWindow(s, t);
        //then
        assertThat(result).isEqualTo("");
    }
}