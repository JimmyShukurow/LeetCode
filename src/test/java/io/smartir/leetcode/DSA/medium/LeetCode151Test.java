package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LeetCode151Test {

    @Test
    public void reverseWords() {
        //given
        LeetCode151 test = new LeetCode151();
        String given = "the sky is blue";
        //when
        var result = test.reverseWords(given);
        //then
        assertThat(result).isEqualTo("blue is sky the");
    }
    @Test
    public void reverseWords2() {
        //given
        LeetCode151 test = new LeetCode151();
        String given = "  hello world  ";
        //when
        var result = test.reverseWords(given);
        //then
        assertThat(result).isEqualTo("world hello");
    }
    @Test
    public void reverseWords3() {
        //given
        LeetCode151 test = new LeetCode151();
        String given = "a good   example";
        //when
        var result = test.reverseWords(given);
        //then
        assertThat(result).isEqualTo("example good a");
    }
    @Test
    public void reverseWords4() {
        //given
        LeetCode151 test = new LeetCode151();
        String given = "EPY2giL";
        //when
        var result = test.reverseWords(given);
        //then
        assertThat(result).isEqualTo("EPY2giL");
    }

}