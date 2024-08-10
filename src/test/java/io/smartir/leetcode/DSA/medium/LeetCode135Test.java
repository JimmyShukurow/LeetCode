package io.smartir.leetcode.DSA.medium;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LeetCode135Test {

    @Test
    public void candy() {
        //given
        LeetCode135 test = new LeetCode135();
        int[] given = {1, 0, 2};
        //when
        var result = test.candy(given);
        //then
        assertThat(result).isEqualTo(5);
    }
    @Test
    public void candy2() {
        //given
        LeetCode135 test = new LeetCode135();
        int[] given = {1, 2, 2};
        //when
        var result = test.candy(given);
        //then
        assertThat(result).isEqualTo(4);
    }
    @Test
    public void candy3() {
        //given
        LeetCode135 test = new LeetCode135();
        int[] given = {1,3,2,2,1};
        //when
        var result = test.candy(given);
        //then
        assertThat(result).isEqualTo(7);
    }
    @Test
    public void candy4() {
        //given
        LeetCode135 test = new LeetCode135();
        int[] given = {1,2,87,87,87,2,1};
        //when
        var result = test.candy(given);
        //then
        assertThat(result).isEqualTo(13);
    }
    @Test
    public void candy5() {
        //given
        LeetCode135 test = new LeetCode135();
        int[] given = {1,6,10,8,7,3,2};
        //when
        var result = test.candy(given);
        //then
        assertThat(result).isEqualTo(18);
    }
}