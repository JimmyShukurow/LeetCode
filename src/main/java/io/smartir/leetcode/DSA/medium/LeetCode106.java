package io.smartir.leetcode.DSA.medium;

public class LeetCode106 {
    int p = 0;
    int i = 0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        p = postorder.length - 1;
        i = inorder.length - 1;
        return build(inorder, postorder, p);
    }

    public TreeNode build(int[] inorder, int[] postorder, int stop) {
        if (p == 0) return null;
        if (inorder[i] == stop){
            i--;
            return null;
        }
        TreeNode node = new TreeNode(postorder[p--]);
        node.right = build(inorder, postorder, stop);
        node.left = build(inorder, postorder, node.val);
        return node;
    }
}
