package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode238Test {

    @Test
    public void productExceptSelf() {
        //given
        LeetCode238 test = new LeetCode238();
        int[] give = {1, 2, 3, 4};
        //when
        var result = test.productExceptSelf(give);
        System.out.println(Arrays.toString(result));
        //then
    }
}