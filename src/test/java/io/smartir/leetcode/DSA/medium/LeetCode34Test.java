package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode34Test {

    @Test
    void searchRange() {
        //given
        LeetCode34 underTest = new LeetCode34();
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        //when
        var res = underTest.searchRange(nums, target);
        //then
        System.out.println(Arrays.toString(res));
    }
    @Test
    void searchRange2() {
        //given
        LeetCode34 underTest = new LeetCode34();
        int[] nums = {5,7,7,8,8,10};
        int target = 6;
        //when
        var res = underTest.searchRange(nums, target);
        //then
        System.out.println(Arrays.toString(res));
    }

    @Test
    void searchRange3() {
        //given
        LeetCode34 underTest = new LeetCode34();
        int[] nums = {};
        int target = 0;
        //when
        var res = underTest.searchRange(nums, target);
        //then
        System.out.println(Arrays.toString(res));
    }
}