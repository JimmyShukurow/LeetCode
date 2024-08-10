package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LeetCode134Test {

    @Test
    public void canCompleteCircuit() {
        //given
        LeetCode134 test = new LeetCode134();
        int[] gases = {1, 2, 3, 4, 5};
        int[] costs = {3, 4, 5, 1, 2};
        //when
        var result = test.canCompleteCircuit(gases, costs);
        //then
        assertThat(result).isEqualTo(3);
    }
    @Test
    public void canCompleteCircuit2() {
        //given
        LeetCode134 test = new LeetCode134();
        int[] gases = {5, 1, 2, 3, 4};
        int[] costs = {4, 4, 1, 5, 1};
        //when
        var result = test.canCompleteCircuit(gases, costs);
        //then
        assertThat(result).isEqualTo(4);
    }
    @Test
    public void canCompleteCircuit3() {
        //given
        LeetCode134 test = new LeetCode134();
        int[] gases = {6, 1, 4, 3, 5};
        int[] costs = {3, 8, 2, 4, 2};
        //when
        var result = test.canCompleteCircuit(gases, costs);
        //then
        assertThat(result).isEqualTo(2);
    }
    @Test
    public void canCompleteCircuit4() {
        //given
        LeetCode134 test = new LeetCode134();
        int[] gases = {2,0,1,2,3,4,0};
        int[] costs = {0,1,0,0,0,0,11};
        //when
        var result = test.canCompleteCircuit(gases, costs);
        //then
        assertThat(result).isEqualTo(0);
    }

}