package io.smartir.leetcode.DSA.medium;

import io.smartir.leetcode.DSA.hard.LeetCode68;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class LeetCode68Test {

    @Test
    public void fullJustify() {
        //given
        LeetCode68 test = new LeetCode68();
        String[] word = new String[]{"This", "is", "an", "example", "of", "text", "justification."};

        int maxWidth = 16;
        //when
        var result = test.fullJustify(word, maxWidth);
        result.forEach(currWord->{
            System.out.println("\"" + currWord + "\"");
        });

        System.out.println("--------------------------------");
        //then
        var actual = result.toArray(new String[0]);
        var expected = new String[]{
                "This    is    an",
                "example  of text",
                "justification.  "
        };
        assertArrayEquals(expected, actual);
    }
    @Test
    public void fullJustify2() {
        //given
        LeetCode68 test = new LeetCode68();
        String[] word = new String[]{"What","must","be","acknowledgment","shall","be"};

        int maxWidth = 16;
        //when
        var result = test.fullJustify(word, maxWidth);
        result.forEach(currWord->{
            System.out.println("\"" + currWord + "\"");
        });
        //then
        var actual = result.toArray(new String[0]);
        var expected = new String[]{
                "What   must   be",
                "acknowledgment  ",
                "shall be        "
        };
        assertArrayEquals(expected, actual);
        System.out.println("--------------------------------");

    } @Test
    public void fullJustify3() {
        //given
        LeetCode68 test = new LeetCode68();
        String[] word = new String[]{"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"};

        int maxWidth = 20;
        //when
        var result = test.fullJustify(word, maxWidth);
        result.forEach(currWord->{
            System.out.println("\"" + currWord + "\"");
        });
        //then
        var actual = result.toArray(new String[0]);
        var expected = new String[]{
                "Science  is  what we",
                "understand      well",
                "enough to explain to",
                "a  computer.  Art is",
                "everything  else  we",
                "do                  "
        };
        assertArrayEquals(expected, actual);
        System.out.println("--------------------------------");

    }
}