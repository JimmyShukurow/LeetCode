package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode200Test {

    @Test
    void numIslands() {
        //given
        LeetCode200 underTest = new LeetCode200();
        char[][] given = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        //when
        var result = underTest.numIslands(given);
        //then
        System.out.println(result);
    }
    @Test
    void numIslands2() {
        //given
        LeetCode200 underTest = new LeetCode200();
        char[][] given = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        //when
        var result = underTest.numIslands(given);
        //then
        System.out.println(result);
    }
}