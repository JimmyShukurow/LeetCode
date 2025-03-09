package io.smartir.leetcode.DSA.hard;

import java.util.*;
//Not Mine solution
class TrieNode {
    TrieNode[] children = new TrieNode[26]; // For 26 lowercase English letters
    boolean isEndOfWord = false;
    String word = null; // To store the complete word at the end node
}

class LeetCode212 {
    int[] rowDir = { -1, 1, 0, 0 };
    int[] colDir = { 0, 0, -1, 1 };

    public List<String> findWords(char[][] board, String[] words) {
        return new AbstractList<String>(){
            List<String> result;
            private void init() {
                result = new ArrayList<>();
                TrieNode root = buildTrie(words);

                Set<String> foundWords = new HashSet<>();
                boolean[][] visited = new boolean[board.length][board[0].length];

                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board[0].length; j++) {
                        dfs(board, i, j, root, visited, foundWords);
                    }
                }

                result.addAll(foundWords);
            }
            @Override
            public int size() {
                if (result == null) {
                    init();
                }
                return result.size();
            }

            @Override
            public String get(int index) {
                return result.get(index);
            }
        };
    }

    private TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            TrieNode node = root;
            for (char ch : word.toCharArray()) {
                int idx = ch - 'a';
                if (node.children[idx] == null) {
                    node.children[idx] = new TrieNode();
                }
                node = node.children[idx];
            }
            node.isEndOfWord = true;
            node.word = word; // Store the complete word at the end node
        }
        return root;
    }

    private void dfs(char[][] board, int x, int y, TrieNode node, boolean[][] visited, Set<String> result) {
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || visited[x][y]) {
            return;
        }

        char ch = board[x][y];
        int idx = ch - 'a';
        if (node.children[idx] == null) {
            return;
        }

        node = node.children[idx];
        if (node.isEndOfWord) {
            result.add(node.word); // Add the found word to the result set
            node.isEndOfWord = false; // Avoid duplicate results
        }

        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int newX = x + rowDir[i];
            int newY = y + colDir[i];
            dfs(board, newX, newY, node, visited, result);
        }
        visited[x][y] = false; // Backtrack
    }
}

