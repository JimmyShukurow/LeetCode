package io.smartir.leetcode.DSA.medium;

import java.util.ArrayList;
import java.util.List;

public class LeetCode22 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        dfs(0, 0, builder, n, res);

        return res;
    }

    private void dfs(int openP, int closeP, StringBuilder s, int n, List<String> res) {
        if (openP == closeP && openP + closeP == n * 2) {
            res.add(s.toString());
            return;
        }

        if (openP < n) {
            dfs(openP + 1, closeP, s.append("("), n, res);
            s.deleteCharAt(s.length() - 1);
        }

        if (closeP < openP) {
            dfs(openP, closeP + 1, s.append( ")"), n, res);
            s.deleteCharAt(s.length() - 1);
        }
    }
}
