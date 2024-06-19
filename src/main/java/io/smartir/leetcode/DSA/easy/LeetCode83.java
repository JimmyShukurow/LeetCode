package io.smartir.leetcode.DSA.easy;

public class LeetCode83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode result = head;
        while (head != null && head.next != null) {
            while ((head != null && head.next != null) && (head.val == head.next.val)) {
                head.next = head.next.next;
            }
            head = head.next;

        }
        return result;

    }
}
