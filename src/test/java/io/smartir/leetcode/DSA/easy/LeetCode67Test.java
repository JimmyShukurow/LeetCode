package io.smartir.leetcode.DSA.easy;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LeetCode67Test {

    @Test
    public void addBinary() {
        //given
        LeetCode67 leetCode67 = new LeetCode67();
        //when
        var result = leetCode67.addBinary("11", "1");
        var expected = "100";
        //then

        assertThat(result).isEqualTo(expected);
    }
}