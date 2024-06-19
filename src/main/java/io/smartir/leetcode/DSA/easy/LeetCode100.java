package io.smartir.leetcode.DSA.easy;

public class LeetCode100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p != null && q != null && p.val != q.val) return false;
        if (p != null && q == null) return false;
        if (p == null) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
