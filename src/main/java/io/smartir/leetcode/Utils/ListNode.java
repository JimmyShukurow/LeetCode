package io.smartir.leetcode.Utils;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void display(ListNode head) {
        while (head != null) {
            System.out.print("("+head.val+")->" );
            head = head.next;
        }
    }
    public static void display(io.smartir.leetcode.DSA.medium.ListNode head) {
        while (head != null) {
            System.out.print("("+head.val+")->" );
            head = head.next;
        }
    }
    public static void display(io.smartir.leetcode.DSA.easy.ListNode head) {
        while (head != null) {
            System.out.print("("+head.val+")->" );
            head = head.next;
        }
    }
}
