package io.smartir.leetcode.DSA.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode30Test {

    @Test
    public void findSubstring() {
        //given
        LeetCode30 test = new LeetCode30();
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        //when
        var result = test.findSubstring(s, words);
        //then
        System.out.println(result);
    }
    @Test
    public void findSubstring2() {
        //given
        LeetCode30 test = new LeetCode30();
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word","good","best","word"};
        //when
        var result = test.findSubstring(s, words);
        //then
        System.out.println(result);
    }
    @Test
    public void findSubstring3() {
        //given
        LeetCode30 test = new LeetCode30();
        String s = "barfoofoobarthefoobarman";
        String[] words = {"bar","foo","the"};
        //when
        var result = test.findSubstring(s, words);
        //then
        System.out.println(result);
    }
    @Test
    public void findSubstring4() {
        //given
        LeetCode30 test = new LeetCode30();
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word","good","best","good"};
        //when
        var result = test.findSubstring(s, words);
        //then
        System.out.println(result);
    }
}