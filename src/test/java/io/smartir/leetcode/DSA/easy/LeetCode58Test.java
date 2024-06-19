package io.smartir.leetcode.DSA.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LeetCode58Test {



    @Test
    public void lengthOfLastWord() {
        //given
        String given = "   fly me   to   the moon  ";
        LeetCode58 leetCode58 = new LeetCode58();
        //when
        var result = leetCode58.lengthOfLastWord(given);
        //then
        assertEquals(4, result);

    }
}