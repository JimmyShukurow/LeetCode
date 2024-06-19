package io.smartir.leetcode.DSA.easy;

public class LeetCode104 {
    public int maxDepth(TreeNode root) {
        int depth = 0;
        if(root == null) return depth;
        int deeper = 0;
        deeper = Math.max(maxDepth(root.right), maxDepth(root.left));
        return 1 + deeper;
    }

}
