package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LeetCode209Test {

    @Test
    public void minSubArrayLen() {
        //given
        LeetCode209 test = new LeetCode209();
        int[] given = {2, 3, 1, 2, 4, 3};
        int target = 7;
        //when
        var result = test.minSubArrayLen(target, given);
        //then
        assertThat(result).isEqualTo(2);
    }
    @Test
    public void minSubArrayLen2() {
        //given
        LeetCode209 test = new LeetCode209();
        int[] given = {1, 2, 3, 4, 5};
        int target = 11;
        //when
        var result = test.minSubArrayLen(target, given);
        //then
        assertThat(result).isEqualTo(3);
    }
}