package io.smartir.leetcode.DSA.medium;

public class LeetCode129 {
    int ans=0;
    public int sumNumbers(TreeNode root) {
        helper(root,0);
        return ans;
    }

    public void helper(TreeNode root , int num)
    {
        if (root == null)
        {

            return ;
        }
        num = root.val + num*10;
        if (root.left==null && root.right == null)
        {
            ans = ans+num;
            return;
        }
        helper( root.left,num);
        helper(root.right,num);
    }
}
