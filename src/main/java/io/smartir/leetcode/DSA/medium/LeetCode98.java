package io.smartir.leetcode.DSA.medium;

import java.util.ArrayList;
import java.util.List;

public class LeetCode98 {
   List<Integer> nums = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        int prev = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) <= prev) return false;
            prev = nums.get(i);
        }
        return true;
    }
    public void inorder(TreeNode root){
        if (root == null) return;
        inorder(root.left);
        nums.add(root.val);
        inorder(root.right);
    }

}
