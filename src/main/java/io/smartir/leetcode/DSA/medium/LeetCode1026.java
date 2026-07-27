package io.smartir.leetcode.DSA.medium;

public class LeetCode1026 {
    int diff = 0;

    void dfs(TreeNode root, int max, int min){
        if(root == null) return;

        max = Math.max(max, root.val);
        min = Math.min(min, root.val);

        diff = Math.max(diff, max - min);

        dfs(root.left, max, min);
        dfs(root.right, max, min);
    }

    public int maxAncestorDiff(TreeNode root) {
        dfs(root, root.val, root.val);
        return diff;
    }
}
