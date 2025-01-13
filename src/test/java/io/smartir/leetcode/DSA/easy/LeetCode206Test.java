package io.smartir.leetcode.DSA.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode206Test {

    @Test
    public void reverseList() {
        //given
        LeetCode206 underTest = new LeetCode206();
        int[] nums = {1, 2};
        ListNode head = new ListNode();
        ListNode curr = new ListNode();
        head.next = curr;
        for (int num : nums) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        curr = head.next.next;
        while (curr != null) {
            System.out.print( curr.val + ", ");
            curr = curr.next;
        }
        head = head.next.next;
        //when
        var result = underTest.reverseList(head);
        //then
        while (result != null) {
            System.out.print( result.val + ", ");
            result = result.next;
        }

    }
}