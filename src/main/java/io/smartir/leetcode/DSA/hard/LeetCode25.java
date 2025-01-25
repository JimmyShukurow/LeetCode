package io.smartir.leetcode.DSA.hard;

import io.smartir.leetcode.DSA.medium.ListNode;

import java.util.Stack;

public class LeetCode25 {
    ListNode result = new ListNode();
    ListNode resultHead = result;
    Stack<ListNode> stack = new Stack<>();

    public ListNode reverseKGroup(ListNode head, int k) {
        while (head != null) {
            for (int i = 0; i < k; i++) {
                if (head != null) {
                    ListNode next = head.next;
                    head.next = null;
                    stack.push(head);
                    head = next;
                } else {
                    break;
                }
            }
            if (stack.size() == k) {
                while (!stack.isEmpty()) {
                    result.next = stack.pop();
                    result = result.next;
                }
            } else if(!stack.isEmpty()) {
                ListNode curr = stack.pop();
                while (!stack.isEmpty()) {
                    ListNode temp = stack.pop();
                    temp.next = curr;
                    curr = temp;
                }
                result.next = curr;
            }
        }
        return resultHead.next;
    }

}
