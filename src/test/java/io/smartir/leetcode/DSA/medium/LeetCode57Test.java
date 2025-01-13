package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode57Test {

    @Test
    public void insert() {
        //given
        LeetCode57 test = new LeetCode57();
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        //when
        var result = test.insert(intervals, newInterval);
        //then
        Arrays.stream(result).forEach(arr-> System.out.print(Arrays.toString(arr)+ " "));
        System.out.println();
    }
    @Test
    public void insert2() {
        //given
        LeetCode57 test = new LeetCode57();
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4, 8};
        //when
        var result = test.insert(intervals, newInterval);
        //then
        Arrays.stream(result).forEach(arr-> System.out.print(Arrays.toString(arr)+ " "));
    }
    @Test
    public void insert3() {
        //given
        LeetCode57 test = new LeetCode57();
        int[][] intervals = {{1,5}};
        int[] newInterval = {2, 3};
        //when
        var result = test.insert(intervals, newInterval);
        //then
        Arrays.stream(result).forEach(arr-> System.out.print(Arrays.toString(arr)+ " "));
    }
}