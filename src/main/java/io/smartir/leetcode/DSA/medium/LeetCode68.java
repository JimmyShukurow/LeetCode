package io.smartir.leetcode.DSA.medium;

import java.util.ArrayList;
import java.util.List;

public class LeetCode68 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int currLength = 0;
        int wordCounter = 0;
        int start = 0;
        for (int i = 0; i < words.length; i++) {
            if (currLength + words[i].length() > maxWidth) {
                int length = maxWidth - (currLength - 1);
                result.add(addGaps(start, i - 1, length, words, wordCounter));
                start = i;
                currLength = 0;
                wordCounter = 0;
            }
            currLength += words[i].length();
            wordCounter++;
            if (i == words.length - 1) {
                result.add(addGaps(start, i, maxWidth -currLength, words, wordCounter));
            }
            if (currLength <= maxWidth) currLength++;
        }
        return result;
    }

    public String addGaps(int start, int end, int length, String[] words, int wordCounter) {
        StringBuilder result = new StringBuilder();
        if (end == words.length - 1) {
            for (int i = end; i > start; i--) {
                result.insert(0, " " + words[i]);
            }
            result.insert(0, words[start] );
            result.append(" ".repeat(length));
        }else {
            wordCounter = Math.max(2, wordCounter);
            int gap = length / (wordCounter - 1);
            for (int i = end; i > start; i--) {
                result.insert(0, " ".repeat(gap + 1) + words[i]);
                length -= gap;
                if (wordCounter>2) wordCounter--;
                gap = length / (wordCounter - 1);
            }
            result.insert(0, words[start] + " ".repeat(length));
        }
        return result.toString();
    }
}
