package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LeetCode150Test {

    @Test
    public void evalRPN() {
        //given
        LeetCode150 underTest = new LeetCode150();
        String[] token = {"2", "1", "+", "3", "*"};
        //when
        var result = underTest.evalRPN(token);
        //then
        assertThat(result).isEqualTo(9);
    }
    @Test
    public void evalRPN2() {
        //given
        LeetCode150 underTest = new LeetCode150();
        String[] token = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        //when
        var result = underTest.evalRPN(token);
        //then
        assertThat(result).isEqualTo(22);
    }
    @Test
    public void evalRPN3() {
        //given
        LeetCode150 underTest = new LeetCode150();
        String[] token = {"4","13","5","/","+"};
        //when
        var result = underTest.evalRPN(token);
        //then
        assertThat(result).isEqualTo(6);
    }
}