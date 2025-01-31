package io.smartir.leetcode.DSA.medium;

import io.smartir.leetcode.Utils.Node;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode117 {
    Queue<Node> upperLevel = new LinkedList<>();
    Queue<Node> lowerLevel = new LinkedList<>();
    public Node connect(Node root) {
        if (root == null) return null;

        upperLevel.offer(root);
        for (Node node : upperLevel) {
            if (node !=null && node.left != null) lowerLevel.offer(node.left);
            if (node != null  && node.right != null) lowerLevel.offer(node.right);
        }
        while (!upperLevel.isEmpty()){
            Node curr = upperLevel.poll();
            curr.next = upperLevel.peek();
        }
        upperLevel = lowerLevel;
        connectCurrent(upperLevel, new LinkedList<>());
        return root;
    }

    public void connectCurrent(Queue<Node> upperLevel, Queue<Node> lowerLevel) {
        if (upperLevel.isEmpty()) return;
        for (Node node : upperLevel) {
            if (node !=null && node.left != null) lowerLevel.offer(node.left);
            if (node != null  && node.right != null) lowerLevel.offer(node.right);
        }
        while (!upperLevel.isEmpty()){
            Node curr = upperLevel.poll();
            curr.next = upperLevel.peek();
        }
        upperLevel = lowerLevel;
        connectCurrent(upperLevel, new LinkedList<>());
    }
}
