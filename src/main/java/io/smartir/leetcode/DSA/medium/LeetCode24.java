package io.smartir.leetcode.DSA.medium;

public class LeetCode24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        return backtrack(head);
    }

    public ListNode backtrack(ListNode first) {
        if (first == null || first.next == null)
            return first;

        ListNode second = first.next;
        first.next = backtrack(second.next);
        second.next = first;
        return second;
    }
}

