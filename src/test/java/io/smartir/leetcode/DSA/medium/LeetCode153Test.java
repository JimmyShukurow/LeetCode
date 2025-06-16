package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode153Test {

    @Test
    void findMin() {
        //given
        LeetCode153 underTest = new LeetCode153();
        int[] nums = {3, 4, 5, 1, 2};
        //when
        var result = underTest.findMin(nums);
        //then
        System.out.println( result);
    }
    @Test
    void findMin2() {
        //given
        LeetCode153 underTest = new LeetCode153();
        int[] nums = {4,5,6,7,0,1,2};
        //when
        var result = underTest.findMin(nums);
        //then
        System.out.println( result);
    }
    @Test
    void findMin3() {
        //given
        LeetCode153 underTest = new LeetCode153();
        int[] nums = {11,13,15,17};
        //when
        var result = underTest.findMin(nums);
        //then
        System.out.println( result);
    }
    @Test
    void findMin4() {
        //given
        LeetCode153 underTest = new LeetCode153();
        int[] nums = {3,1,2};
        //when
        var result = underTest.findMin(nums);
        //then
        System.out.println( result);
    }
}