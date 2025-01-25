package io.smartir.leetcode.DSA.easy;

public class LeetCode206 {
    public ListNode reverseList(ListNode head) {
        ListNode resutl = null;
        while (head != null){
            ListNode prev = resutl;
            ListNode curr = new ListNode(head.val,head.next);
            curr.next = prev;
            resutl = curr;
            head = head.next;
        }
        return resutl;
    }
}
