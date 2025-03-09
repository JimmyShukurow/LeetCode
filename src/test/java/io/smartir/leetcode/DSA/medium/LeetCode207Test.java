package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LeetCode207Test {

    @Test
    void canFinish() {
        //given
        LeetCode207 underTest = new LeetCode207();
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}, {0, 1}};
        //when
        boolean result = underTest.canFinish(numCourses, prerequisites);
        //then
        assertThat(result).isFalse();
    }
}