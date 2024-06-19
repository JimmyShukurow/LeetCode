package io.smartir.leetcode.DSA.easy;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;



class LeetCode69Test {

    @Test
    public void mySqrt() {

        //given
        LeetCode69 leetCode69 = new LeetCode69();

        //when
        var result = leetCode69.mySqrt(2147483647);
        var expected = 0;
        //then
        assertThat(result).isEqualTo(expected);
    }

}