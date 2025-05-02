package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LeetCode79Test {

    @Test
    void exist() {
        //given
        LeetCode79 underTest = new LeetCode79();
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        //when
        var result = underTest.exist(board, word);
        //then
        System.out.println(result);
    }
    @Test
    void exist2() {
        //given
        LeetCode79 underTest = new LeetCode79();
        char[][] board = {{'A','B','C','E'}, {'S','F','E','S'}, {'A','D','E','E'}};
        String word = "ABCESEEEFS";
        //when
        var result = underTest.exist(board, word);
        //then
        assertThat(result).isTrue();
    }
}