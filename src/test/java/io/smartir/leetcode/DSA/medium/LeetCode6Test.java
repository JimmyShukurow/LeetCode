package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LeetCode6Test {

    @Test
    public void convert() {
        //given
        LeetCode6 test = new LeetCode6();
        String given = "PAYPALISHIRING";
        int numRows = 3;
        //when
        var result = test.convert(given, numRows);
        //then
        assertThat(result).isEqualTo("PAHNAPLSIIGYIR");
    }
    @Test
    public void convert2() {
        //given
        LeetCode6 test = new LeetCode6();
        String given = "PAYPALISHIRING";
        int numRows = 4;
        //when
        var result = test.convert(given, numRows);
        //then
        assertThat(result).isEqualTo("PINALSIGYAHRPI");
    }

    @Test
    public void convert3() {
        //given
        LeetCode6 test = new LeetCode6();
        String given = "A";
        int numRows = 1;
        //when
        var result = test.convert(given, numRows);
        //then
        assertThat(result).isEqualTo("A");
    }
    @Test
    public void convert4() {
        //given
        LeetCode6 test = new LeetCode6();
        String given = "AB";
        int numRows = 1;
        //when
        var result = test.convert(given, numRows);
        //then
        assertThat(result).isEqualTo("AB");
    }
    @Test
    public void convert5() {
        //given
        LeetCode6 test = new LeetCode6();
        String given = "ABC";
        int numRows = 1;
        //when
        var result = test.convert(given, numRows);
        //then
        assertThat(result).isEqualTo("ABC");
    }

}