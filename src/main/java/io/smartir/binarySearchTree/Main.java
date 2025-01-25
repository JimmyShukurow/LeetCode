package io.smartir.binarySearchTree;


import io.smartir.leetcode.DSA.medium.ListNode;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = new ListNode(arr[0]);
        ListNode result = head;
        ListNode copyHead = head;
        for (int i = 1; i < arr.length; i++) {
            head.next = new ListNode(arr[i]);
            head = head.next;
        }
        while (result != null) {
            System.out.print("(" + result.val + ")->");
            result = result.next;
        }
        System.out.println();
        ListNode reversed = reverseLinkedList(copyHead);
        System.out.println("Reversed");
        while (reversed != null) {
            System.out.print("(" + reversed.val + ")->");
            reversed = reversed.next;
        }
    }

    public static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode curr =head;
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
