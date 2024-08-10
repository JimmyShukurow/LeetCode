package io.smartir.leetcode.DSA.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode205Test {

    @Test
    public void isIsomorphic() {
        //given
        LeetCode205 test = new LeetCode205();
        String s = "egg";
        String t = "add";
        //when
        var result = test.isIsomorphic(s, t);
        //then
        assertTrue(result);
    }
    @Test
    public void isIsomorphic2() {
        //given
        LeetCode205 test = new LeetCode205();
        String s = "foo";
        String t = "bar";
        //when
        var result = test.isIsomorphic(s, t);
        //then
        assertFalse(result);
    }
    @Test
    public void isIsomorphic3() {
        //given
        LeetCode205 test = new LeetCode205();
        String s = "paper";
        String t = "title";
        //when
        var result = test.isIsomorphic(s, t);
        //then
        assertTrue(result);
    }
    @Test
    public void isIsomorphic4() {
        //given
        LeetCode205 test = new LeetCode205();
        String s = "bbbaaaba";
        String t = "aaabbbba";
        //when
        var result = test.isIsomorphic(s, t);
        //then
        assertFalse(result);
    }
 @Test
    public void isIsomorphic5() {
        //given
        LeetCode205 test = new LeetCode205();
        String s = "badc";
        String t = "baba";
        //when
        var result = test.isIsomorphic(s, t);
        //then
        assertFalse(result);
    }

}