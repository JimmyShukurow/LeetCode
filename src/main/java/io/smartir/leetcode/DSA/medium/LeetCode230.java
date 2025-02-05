package io.smartir.leetcode.DSA.medium;

public class LeetCode230 {
    public int kthSmallest(TreeNode root, int k) {
        return inorder(root, k);
    }
    public int inorder(TreeNode root, int counter){
        if (root == null) return -1;
        inorder(root.left, counter);
        if (counter == 0) return root.val;
        counter--;
        inorder(root.right,counter);
        return -1;
    }
}
