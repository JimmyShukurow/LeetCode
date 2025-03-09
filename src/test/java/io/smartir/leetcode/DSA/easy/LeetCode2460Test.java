package io.smartir.leetcode.DSA.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode2460Test {

    @Test
    void applyOperations() {
        //given
        LeetCode2460 test = new LeetCode2460();
        int[] operations = {1,2,2,1,1,0};
        //when
        var result = test.applyOperations(operations);
        //then
        System.out.println(Arrays.toString(result));
    }
    @Test
    void applyOperations2() {
        //given
        LeetCode2460 test = new LeetCode2460();
        int[] operations = {0,1};
        //when
        var result = test.applyOperations(operations);
        //then
        System.out.println(Arrays.toString(result));
    }
}