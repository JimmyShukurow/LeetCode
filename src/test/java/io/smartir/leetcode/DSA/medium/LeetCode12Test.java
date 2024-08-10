package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LeetCode12Test {

    @Test
    public void intToRoman() {
        //given
        LeetCode12 test = new LeetCode12();
        int given = 59;
        //when
        var result = test.intToRoman(given);
        System.out.println(result);
        //then
        assertThat(result).isEqualTo("LIX");
    }

    @Test
    public void intToRoman2() {
        //given
        LeetCode12 test = new LeetCode12();
        int given = 78;
        //when
        var result = test.intToRoman(given);
        System.out.println(result);
        //then
        assertThat(result).isEqualTo("LXXVIII");
    }
    @Test
    public void intToRoman3() {
        //given
        LeetCode12 test = new LeetCode12();
        int given = 1994;
        //when
        var result = test.intToRoman(given);
        System.out.println(result);
        //then
        assertThat(result).isEqualTo("MCMXCIV");
    }
    @Test
    public void intToRoman4() {
        //given
        LeetCode12 test = new LeetCode12();
        int given = 3749;
        //when
        var result = test.intToRoman(given);
        System.out.println(result);
        //then
        assertThat(result).isEqualTo("MMMDCCXLIX");
    }
}