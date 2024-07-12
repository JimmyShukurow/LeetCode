package io.smartir.leetcode.DSA.easy;

public class LeetCode141 {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode oneStepper = head;
        ListNode twoStepper = head.next;
        while (oneStepper != null && twoStepper != null && twoStepper.next != null) {
            if (oneStepper == twoStepper) return true;
            oneStepper = oneStepper.next;
            twoStepper = twoStepper.next.next;
        }
        return false;
    }
}
