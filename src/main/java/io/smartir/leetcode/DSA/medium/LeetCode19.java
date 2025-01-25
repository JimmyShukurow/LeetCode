package io.smartir.leetcode.DSA.medium;

public class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) return null;
        ListNode copy = head;
        ListNode result = copy;
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        if (length == n) return result.next;
        int stepper = length - n-1;
        while (stepper > 0){
            copy = copy.next;
            stepper--;
        }
        copy.next = copy.next.next;
        return result;
    }
}
