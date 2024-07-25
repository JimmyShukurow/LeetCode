package io.smartir.leetcode.DSA.medium;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode122Test {

    @Test
    public void maxProfit() {
        //given
        LeetCode122 test = new LeetCode122();
        int[] given = {7, 1, 5, 3, 6, 4};
        //when
        var result = test.maxProfit(given);
        //then
        assertThat(result).isEqualTo(7);
    }
    @Test
    public void maxProfit2() {
        //given
        LeetCode122 test = new LeetCode122();
        int[] given = {1,2,3,4,5};
        //when
        var result = test.maxProfit(given);
        //then
        assertThat(result).isEqualTo(4);
    }
    @Test
    public void maxProfit3() {
        //given
        LeetCode122 test = new LeetCode122();
        int[] given = {7,6,4,3,1};
        //when
        var result = test.maxProfit(given);
        //then
        assertThat(result).isEqualTo(0);
    }

}