package io.smartir.leetcode.DSA.easy;

public class LeetCode110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if(Math.abs(depth(root.left)-depth(root.right))>1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int depth(TreeNode root) {
        int depth = 0;
        if(root == null) return depth;
        return 1 + Math.max(depth(root.left), depth(root.right));
    }
}
