package io.smartir.leetcode.DSA.easy;

public class LeetCode108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        if(nums.length == 1) return new TreeNode(nums[0]);
        TreeNode result = new TreeNode(nums[nums.length / 2]);
        TreeNode root = result;
        int[] left = new int[nums.length / 2];
        for (int i = 0; i < left.length; i++) {
            left[i] = nums[i];
        }

        int[] right = new int[nums.length - nums.length / 2-1];
        for (int i = 0; i < right.length; i++) {
            right[i] = nums[nums.length/2 + i+1];
        }
        root.left = sortedArrayToBST(left);
        root.right = sortedArrayToBST(right);

        return result;
    }
}
