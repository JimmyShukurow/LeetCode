package io.smartir.leetcode.DSA.easy;

public class LeetCode543 {
    int maxLeft = 0;
    int maxRight = 0;
    int maxDistance = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root ==  null) return maxDistance;
        maxLeft = getMaxDepth(root.left);
        maxRight = getMaxDepth(root.right);
        int tempMaxDistance = maxLeft + maxRight;
        maxDistance = Math.max(diameterOfBinaryTree(root.left), tempMaxDistance);
        maxDistance = Math.max(diameterOfBinaryTree(root.right), tempMaxDistance);
        return maxDistance;
    }
    private int getMaxDepth(TreeNode node ){
        if(node == null) return 0;
        return 1 + Math.max(getMaxDepth(node.right), getMaxDepth(node.left));
    }
}
