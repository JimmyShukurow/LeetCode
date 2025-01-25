package io.smartir.leetcode.DSA.medium;

public class LeetCode82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode result = new ListNode(0,head);
        ListNode copy = result;
        while (head != null && head.next != null){
            if (head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val){
                    head = head.next;
                }
                result.next = head.next;
            }else{
                result = result.next;
            }
            head = head.next;
        }
        return copy.next;
    }
}
