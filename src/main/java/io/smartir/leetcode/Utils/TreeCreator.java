package io.smartir.leetcode.Utils;

import io.smartir.leetcode.DSA.medium.TreeNode;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class TreeCreator {

    private Queue<TreeNode> queueCopy = new LinkedList<>();


    public TreeNode createBinaryTree(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        // Create the root of the tree
        TreeNode root = new TreeNode(arr[0]);

        // Use a queue to keep track of the nodes
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queueCopy.offer(root);

        int i = 1;
        while (i < arr.length) {
            // Take the front node from the queue
            TreeNode current = queue.poll();

            // Insert the left child
            if (i < arr.length && arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.offer(current.left);
                queueCopy.offer(current.left);
            }
            i++;

            // Insert the right child
            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.offer(current.right);
                queueCopy.offer(current.right);
            }
            i++;
        }

        return root;
    }

    public void displayTree() {
        int currDepth = 1;
        int maxLeftDepth = getLeftMaxDepth(queueCopy.peek());
        while (!queueCopy.isEmpty()) {
            String spaces = " ".repeat((maxLeftDepth - currDepth) * 2);
            System.out.print(spaces);
            for (int i = 0; i < Math.pow(2.0, currDepth - 1.0); i++) {
                if (!queueCopy.isEmpty()) {
                    if (i % 2 == 1) System.out.print(" ".repeat(2));

                    if (queueCopy.peek() != null) System.out.print("(" + queueCopy.poll().val + ")");
                }
            }
            currDepth++;
            System.out.println();
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
