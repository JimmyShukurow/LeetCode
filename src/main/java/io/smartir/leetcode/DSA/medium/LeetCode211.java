package io.smartir.leetcode.DSA.medium;

import java.util.ArrayList;
import java.util.List;

public class LeetCode211 {
    LeetCode211[] children;
    boolean endOfWord;
    static int[] map = new int[128];

    static {
        for (char i = 'a'; i <= 'z'; ++i) {
            map[i] = i - 'a';
        }
    }

    public LeetCode211() {
        children = new LeetCode211[26];
        endOfWord = false;
    }

    public void addWord(String word) {
        addWord(word, 0);
    }

    public boolean search(String word) {
        return search(word, 0);
    }

    private void addWord(String word, int index) {
        if (index == word.length()) {
            this.endOfWord = true;
            return;
        }
        int i = map[word.charAt(index)];
        if (children[i] == null) {
            children[i] = new LeetCode211();
        }
        children[i].addWord(word, index + 1);
    }

    private boolean search(String word, int index) {
        if (index == word.length()) {
            return this.endOfWord;
        }
        if (word.charAt(index) == '.') {
            for (LeetCode211 child : children) {
                if (child != null && child.search(word, index + 1)) {
                    return true;
                }
            }
        }
        int i = map[word.charAt(index)];
        if (children[i] == null) {
            return false;
        }
        return children[i].search(word, index + 1);
    }
}
