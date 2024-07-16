package io.smartir.leetcode.DSA.easy;

import io.smartir.leetcode.DSA.medium.LeetCode5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LeetCode392Test {

    @Test
    public void isSubsequence() {
        //given
        LeetCode392 test = new LeetCode392();
        String s = "abc";
        String t = "ahbgdc";
        //when
        var result = test.isSubsequence(s, t);
        //then
        assertThat(result).isTrue();
    }
    @Test
    public void isSubsequence2() {
        //given
        LeetCode392 test = new LeetCode392();
        String s = "b";
        String t = "abc";
        //when
        var result = test.isSubsequence(s, t);
        //then
        assertThat(result).isTrue();
    }

}