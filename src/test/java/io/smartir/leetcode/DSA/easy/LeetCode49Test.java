package io.smartir.leetcode.DSA.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode49Test {

    @Test
    public void groupAnagrams() {
        //given
        LeetCode49 test = new LeetCode49();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        //when
        var result = test.groupAnagrams(strs);
        //then
        System.out.println(result);
    }
    @Test
    public void groupAnagrams2() {
        //given
        LeetCode49 test = new LeetCode49();
        String[] strs = {""};
        //when
        var result = test.groupAnagrams(strs);
        //then
        System.out.println(result);
    }
    @Test
    public void groupAnagrams3() {
        //given
        LeetCode49 test = new LeetCode49();
        String[] strs = {"a"};
        //when
        var result = test.groupAnagrams(strs);
        //then
        System.out.println(result);
    }
    @Test
    public void groupAnagrams4() {
        //given
        LeetCode49 test = new LeetCode49();
        String[] strs = {"","b"};
        //when
        var result = test.groupAnagrams(strs);
        //then
        System.out.println(result);
    }
    @Test
    public void groupAnagrams5() {
        //given
        LeetCode49 test = new LeetCode49();
        String[] strs = {"",""};
        //when
        var result = test.groupAnagrams(strs);
        //then
        System.out.println(result);
    }
}