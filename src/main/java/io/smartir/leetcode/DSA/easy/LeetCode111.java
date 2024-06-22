package io.smartir.leetcode.DSA.easy;

public class LeetCode111 {

    public int minDepth(TreeNode root) {
        int depth = 0;
        if (root.left == null && root.right == null) return 1;
        else if (root.right != null) {
            depth += minDepth(root.right)+1;
        } else {
            depth += minDepth(root.left)+1;
        }
        return depth;
    }

}
