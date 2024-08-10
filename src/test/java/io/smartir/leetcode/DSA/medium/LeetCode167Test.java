package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode167Test {

    @Test
    public void twoSum() {
        //given
        LeetCode167 test = new LeetCode167();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        //when
        var result = test.twoSum(numbers, target);
        var expected = new int[]{1, 2};
        //then
        assertArrayEquals(expected, result);
    }
    @Test
    public void twoSum2() {
        //given
        LeetCode167 test = new LeetCode167();
        int[] numbers = {2,3,4};
        int target = 6;
        //when
        var result = test.twoSum(numbers, target);
        var expected = new int[]{1, 3};
        //then
        assertArrayEquals(expected, result);
    }
    @Test
    public void twoSum3() {
        //given
        LeetCode167 test = new LeetCode167();
        int[] numbers = {-1,0};
        int target = -1;
        //when
        var result = test.twoSum(numbers, target);
        var expected = new int[]{1, 2};
        //then
        assertArrayEquals(expected, result);
    }
    @Test
    public void twoSum4() {
        //given
        LeetCode167 test = new LeetCode167();
        int[] numbers = {-10,-8,-2,1,2,5,6};
        int target = 0;
        //when
        var result = test.twoSum(numbers, target);
        var expected = new int[]{3, 5};
        //then
        assertArrayEquals(expected, result);
    }
}