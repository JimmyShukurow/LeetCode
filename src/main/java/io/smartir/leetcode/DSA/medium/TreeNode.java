package io.smartir.leetcode.DSA.medium;

import java.util.*;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    List<List<TreeNode>> listToDisplayTree = new ArrayList<>();
    static Queue<TreeNode> queue;

    public Queue<TreeNode> getQueue() {
        return queue;
    }

    TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode createBinaryTree(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        // Create the root of the tree
        TreeNode root = new TreeNode(arr[0]);

        // Use a queue to keep track of the nodes
        queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (i < arr.length) {
            // Take the front node from the queue
            TreeNode current = queue.poll();

            // Insert the left child
            if (i < arr.length && arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.offer(current.left);
            }
            i++;

            // Insert the right child
            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }

    public static void displayTree() {
        int currDepth = 1;
        int maxLeftDepth = getLeftMaxDepth(queue.peek());
//        while (!queue.isEmpty()) {
//            for (int i = 0; i < Math.pow(2., currDepth - 1.0); i++) {
//                System.out.print(" ".repeat((maxLeftDepth - currDepth) * 2) + Objects.requireNonNull(queue.poll()).val);
//            }
//            currDepth++;
//            System.out.println();
//        }
        for (TreeNode treeNode : queue) {
            System.out.println(treeNode.val);
        }

    }

    public static int getLeftMaxDepth(TreeNode root) {
        int maxLeftDepth = 0;
        while (root != null) {
            maxLeftDepth++;
            root = root.left;
        }
        return maxLeftDepth;
    }

}
