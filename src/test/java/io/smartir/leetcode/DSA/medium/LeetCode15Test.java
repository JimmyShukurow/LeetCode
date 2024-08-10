package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode15Test {

    @Test
    public void threeSum() {
        //given
        LeetCode15 test = new LeetCode15();
        int[] given = {-1, 0, 1, 2, -1, -4};

        //when
        var result = test.threeSum(given);
        //then
        System.out.println(result);
    }
    @Test
    public void threeSum2() {
        //given
        LeetCode15 test = new LeetCode15();
        int[] given = {0,1,1};

        //when
        var result = test.threeSum(given);
        //then
        System.out.println(result);
    }
    @Test
    public void threeSum3() {
        //given
        LeetCode15 test = new LeetCode15();
        int[] given = {0,0,0};

        //when
        var result = test.threeSum(given);
        //then
        System.out.println(result);
    }
    @Test
    public void threeSum4() {
        //given
        LeetCode15 test = new LeetCode15();
        int[] given = {-2,0,1,1,2};

        //when
        var result = test.threeSum(given);
        //then
        System.out.println(result);
    }
    @Test
    public void threeSum5() {
        //given
        LeetCode15 test = new LeetCode15();
        int[] given = {-1,0,1,2,-1,-4,-2,-3,3,0,4};

        //when
        var result = test.threeSum(given);
        //then
        System.out.println(result);
    }


}