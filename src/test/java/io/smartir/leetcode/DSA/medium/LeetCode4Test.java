package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode4Test {

    @Test
    void findMedianSortedArraysTest() {
        //given
        LeetCode4 underTest = new LeetCode4();
        int[] given1 = {1, 3};
        int[] given2 = {2};
        //when
        var result = underTest.findMedianSortedArrays(given1, given2);
        //then

        System.out.println(result);
    }

    @Test
    void findMedianSortedArraysTest2() {
        //given
        LeetCode4 underTest = new LeetCode4();
        int[] given1 = {1, 2};
        int[] given2 = {3,4};
        //when
        var result = underTest.findMedianSortedArrays(given1, given2);
        //then

        System.out.println(result);
    }

}