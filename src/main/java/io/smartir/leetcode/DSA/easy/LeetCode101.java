package io.smartir.leetcode.DSA.easy;

public class LeetCode101 {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        return compare(root.left,root.right);

    }
    boolean compare(TreeNode left,TreeNode right)
    {
        if(left==null&& right==null)return true;
        if(left==null||right==null)return false;

        return left.val==right.val && compare(left.left,right.right)&& compare(left.right,right.left);
    }
}
