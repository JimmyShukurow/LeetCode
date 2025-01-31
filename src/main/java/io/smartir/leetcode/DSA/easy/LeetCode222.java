package io.smartir.leetcode.DSA.easy;

public class LeetCode222 {
    int count = 0;
    public int countNodes(TreeNode root) {
        count(root);
        return count;
    }

    public void count(TreeNode root){
        if (root == null) return;
        count++;
        count(root.left);
        count(root.right);
    }
}
