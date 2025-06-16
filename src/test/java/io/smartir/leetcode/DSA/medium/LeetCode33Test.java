package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode33Test {

    @Test
    void search() {
        //given
        LeetCode33 underTest = new LeetCode33();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        //when
        var result = underTest.search(nums, target);
        //then
        System.out.println(result);
    }

    @Test
    void search2() {
        //given
        LeetCode33 underTest = new LeetCode33();
        int[] nums = {4,5,6,7,0,1,2};
        int target = 3;
        //when
        var result = underTest.search(nums, target);
        //then
        System.out.println(result);
    }
}