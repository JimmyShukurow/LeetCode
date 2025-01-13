package io.smartir.leetcode.DSA.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

    @Test
    public void check() {
        var expected = IntStream.rangeClosed(1, 10).boxed().toList();
        System.out.println(expected);
        var actual = new java.util.ArrayList<>(IntStream.rangeClosed(1, 10).boxed().toList());
        Collections.shuffle(actual);
        Collections.sort(actual);
        System.out.println(actual);
        Assertions.assertIterableEquals(actual,expected);
    }
}