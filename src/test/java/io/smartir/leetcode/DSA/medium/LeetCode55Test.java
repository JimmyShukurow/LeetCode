package io.smartir.leetcode.DSA.medium;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode55Test {

    @Test
    public void canJump() {
        //given
        LeetCode55 test = new LeetCode55();
        int[] given = {2, 0, 0};
        //when
        var result = test.canJump(given);
        //then
        assertThat(result).isTrue();
    }
@Test
    public void canJump2() {
        //given
        LeetCode55 test = new LeetCode55();
        int[] given = {2, 0};
        //when
        var result = test.canJump(given);
        //then
        assertThat(result).isTrue();
    }
@Test
    public void canJump3() {
        //given
        LeetCode55 test = new LeetCode55();
        int[] given = {2,3,1,1,4};
        //when
        var result = test.canJump(given);
        //then
        assertThat(result).isTrue();
    }
@Test
    public void canJump4() {
        //given
        LeetCode55 test = new LeetCode55();
        int[] given = {3,2,1,0,4};
        //when
        var result = test.canJump(given);
        //then
        assertThat(result).isFalse();
    }
    @Test
    public void canJump5() {
        //given
        LeetCode55 test = new LeetCode55();
        int[] given = {3,0,0,0};
        //when
        var result = test.canJump(given);
        //then
        assertThat(result).isTrue();
    }

}