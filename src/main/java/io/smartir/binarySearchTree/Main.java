package io.smartir.binarySearchTree;


import io.smartir.leetcode.DSA.medium.ListNode;
import io.smartir.leetcode.Utils.TreeCreator;

public class Main {

    public static void main(String[] args) {

        Integer[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9, null, 10};
        TreeCreator creator = new TreeCreator();
        creator.createBinaryTree(test);
        creator.displayTree();

    }

    public static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            //This 2 lines are the main logic
            // other lines just to continue the loop
            curr.next = prev;
            prev = curr;
            //--------------------------------
            curr = next;
        }
        return prev;
    }
}
