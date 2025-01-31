package io.smartir.leetcode.DSA.medium;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode114 {
    Queue<TreeNode> queue = new LinkedList<>();
    public void flatten(TreeNode root) {
        preOrderTraverse(root);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            curr.left = null;
            curr.right = queue.peek();
        }
    }

    public void preOrderTraverse(TreeNode root) {
        if (root == null) return;
        queue.offer(root);
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);
    }
}
