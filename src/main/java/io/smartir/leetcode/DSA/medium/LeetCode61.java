package io.smartir.leetcode.DSA.medium;

public class LeetCode61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();
        ListNode list1Head = list1;
        ListNode list2Head = list2;
        ListNode copy = head;
        int length = 0;
        while (copy != null) {
            length++;
            copy = copy.next;
        }
        if (length == 1 || k % length == 0) return head;
        k = k % length;
        while (length > k) {
            list1.next = head;
            head = head.next;
            list1 = list1.next;
            length--;
        }
        list1.next = null;
        while (length > 0 && head != null) {
            list2.next = head;
            list2 = list2.next;
            head = head.next;
            length--;
        }
        list2.next = list1Head.next;
        return list2Head.next;
    }
}
