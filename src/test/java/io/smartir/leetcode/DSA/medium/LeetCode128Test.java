package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LeetCode128Test {

    @Test
    public void longestConsecutive() {
        //given
        LeetCode128 test = new LeetCode128();
        int[] given = {100, 4, 200, 1, 3, 2};
        //when
        var result = test.longestConsecutive(given);
        //then
        assertThat(result).isEqualTo(4);
    }
    @Test
    public void longestConsecutive2() {
        //given
        LeetCode128 test = new LeetCode128();
        int[] given = {0,3,7,2,5,8,4,6,0,1};
        //when
        var result = test.longestConsecutive(given);
        //then
        assertThat(result).isEqualTo(9);
    }
    @Test
    public void longestConsecutive3() {
        //given
        LeetCode128 test = new LeetCode128();
        int[] given = {1,2,0,1};
        //when
        var result = test.longestConsecutive(given);
        //then
        assertThat(result).isEqualTo(3);
    }
    @Test
    public void longestConsecutive4() {
        //given
        LeetCode128 test = new LeetCode128();
        int[] given = {0,0};
        //when
        var result = test.longestConsecutive(given);
        //then
        assertThat(result).isEqualTo(1);
    }
    @Test
    public void longestConsecutive5() {
        //given
        LeetCode128 test = new LeetCode128();
        int[] given = {};
        //when
        var result = test.longestConsecutive(given);
        //then
        assertThat(result).isEqualTo(0);
    }
    @Test
    public void longestConsecutive6() {
        //given
        LeetCode128 test = new LeetCode128();
        int[] given = {9,1,4,7,3,-1,0,5,8,-1,6};
        //when
        var result = test.longestConsecutive(given);
        //then
        assertThat(result).isEqualTo(7);
    }

}