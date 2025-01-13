package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode54Test {

    @Test
    public void spiralOrder() {
        //given
        LeetCode54 test = new LeetCode54();
        int[][] given = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //when
        List<Integer> result = test.spiralOrder(given);
        var expected = List.of(1, 2, 3, 6, 9, 8, 7, 4, 5);
        //then
        System.out.println(result);
        Assertions.assertIterableEquals(result, expected);
    }

    @Test
    public void spiralOrder2() {
        //given
        LeetCode54 test = new LeetCode54();
        int[][] given = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        //when
        List<Integer> result = test.spiralOrder(given);
        var expected = List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
        //then
        System.out.println(result);
        Assertions.assertIterableEquals(result, expected);
    }
    @Test
    public void spiralOrder3() {
        //given
        LeetCode54 test = new LeetCode54();
        int[][] given = {
                {1, 2, 3, 4},
        };
        //when
        List<Integer> result = test.spiralOrder(given);
        var expected = List.of(1, 2, 3, 4);
        //then
        System.out.println(result);
        Assertions.assertIterableEquals(result, expected);
    }

}

