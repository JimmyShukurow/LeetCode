package io.smartir.leetcode.DSA.medium;

public class LeetCode138 {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node currentNode = head;
        while (currentNode != null) {
            Node copy = new Node(currentNode.val);
            copy.next = currentNode.next;
            currentNode.next = copy;
            currentNode = copy.next;
        }
        currentNode = head;
        while (currentNode != null) {
            if (currentNode.random != null) currentNode.next.random = currentNode.random.next;
            currentNode = currentNode.next.next;
        }
        currentNode = head;
        Node newHead = head.next;
        Node newCurrentNode = newHead;

        while (currentNode != null) {
            currentNode.next = newCurrentNode.next;
            currentNode = currentNode.next;
            if (currentNode != null) {
                newCurrentNode.next = currentNode.next;
                newCurrentNode = newCurrentNode.next;
            }
        }

        return newHead;
    }
}
