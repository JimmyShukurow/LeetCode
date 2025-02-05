package io.smartir.leetcode.DSA.medium;

import java.util.Stack;

public class LeetCode530 {
    Stack<Integer> nums = new Stack<>();
    int min = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return min;
    }
    public void inorder(TreeNode root){
        if (root == null) return;
        inorder(root.left);
        if(!nums.isEmpty()){
            min = Math.min(min, Math.abs(nums.peek() - root.val));
        }
        nums.push(root.val);
        inorder(root.right);
    }
}
