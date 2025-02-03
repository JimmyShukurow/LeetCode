package io.smartir.leetcode.DSA.medium;

import java.util.ArrayList;
import java.util.List;

public class LeetCode199 {
    List<Integer> rightView = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        helper(root, 0);
        return rightView;
    }
    public void helper(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (rightView.size() == level) {
            rightView.add(root.val);
        }
        helper(root.right, level + 1);
        helper(root.left, level + 1);
    }
}
