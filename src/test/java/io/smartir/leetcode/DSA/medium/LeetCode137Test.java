package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode137Test {

    @Test
    public void singleNumber(){
        //given
        LeetCode137 underTest = new LeetCode137();
        int[] nums = {2, 2, 3, 2};
        //when
        var result = underTest.singleNumber(nums);
        //then
        System.out.println(result);
    }


    @Test
    public void singleNumber2(){
        //given
        LeetCode137 underTest = new LeetCode137();
        int[] nums = {0,1,0,1,0,1,99};
        //when
        var result = underTest.singleNumber(nums);
        //then
        System.out.println(result);
    }

    @Test
    public void singleNumber3(){
        //given
        LeetCode137 underTest = new LeetCode137();
        int[] nums = {2,2,2,3,4,4,4};
        //when
        var result = underTest.singleNumber(nums);
        //then
        System.out.println(result);
    }

}