package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LeetCode71Test {

    @Test
    void simplifyPath() {
        //given
        LeetCode71 underTest = new LeetCode71();
        String given = "/home/";
        //when
        String result = underTest.simplifyPath(given);
        //then
        assertThat(result).isEqualTo("/home");
    }
    @Test
    void simplifyPath2() {
        //given
        LeetCode71 underTest = new LeetCode71();
        String given = "/home//foo/";
        //when
        String result = underTest.simplifyPath(given);
        //then
        assertThat(result).isEqualTo("/home/foo");
    }
    @Test
    void simplifyPath3() {
        //given
        LeetCode71 underTest = new LeetCode71();
        String given = "/home/user/Documents/../Pictures";
        //when
        String result = underTest.simplifyPath(given);
        //then
        assertThat(result).isEqualTo("/home/user/Pictures");
    }
    @Test
    void simplifyPath4() {
        //given
        LeetCode71 underTest = new LeetCode71();
        String given = "/../";
        //when
        String result = underTest.simplifyPath(given);
        //then
        assertThat(result).isEqualTo("/");
    }
    @Test
    void simplifyPath5() {
        //given
        LeetCode71 underTest = new LeetCode71();
        String given = "/.../a/../b/c/../d/./";
        //when
        String result = underTest.simplifyPath(given);
        //then
        assertThat(result).isEqualTo("/.../b/d");
    }
    @Test
    void simplifyPath6() {
        //given
        LeetCode71 underTest = new LeetCode71();
        String given = "/a//b////c/d//././/..";
        //when
        String result = underTest.simplifyPath(given);
        //then
        assertThat(result).isEqualTo("/.../b/d");
    }

}