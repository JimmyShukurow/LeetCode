package io.smartir.leetcode.DSA.medium;

public class LeetCode72 {
    public int minDistance(String word1, String word2) {
        Integer[][] memo = new Integer[word1.length()+1][word2.length()+1];
        return recur(word1, word2, word1.length()-1, word2.length()-1, memo);
    }

    int recur(String word1, String word2, int i, int j, Integer[][] memo) {

        if(i<0) return j+1;
        if(j<0) return i+1;
        if(memo[i][j] != null) return memo[i][j];
        int answer = 0;
        if(word1.charAt(i) == word2.charAt(j)) {
            answer = recur(word1, word2, i-1, j-1, memo);
        } else {

            int replace = recur(word1, word2, i-1, j-1, memo);
            int delete = recur(word1, word2, i-1, j, memo);
            int insert = recur(word1, word2, i, j-1, memo);

            answer = Math.min(replace, Math.min(delete, insert)) + 1;
        }

        memo[i][j] = answer;
        return answer;
    }
}
