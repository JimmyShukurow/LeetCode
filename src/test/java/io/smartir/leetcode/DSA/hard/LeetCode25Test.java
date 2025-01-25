package io.smartir.leetcode.DSA.hard;

import io.smartir.leetcode.DSA.medium.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode25Test {

    @Test
    void reverseKGroup() {
        //given
        LeetCode25 underTest = new LeetCode25();
        int[] nums = {1,2,3,4};
        ListNode head = new ListNode(nums[0]);
        ListNode curr = head;
        for (int i = 1; i < nums.length; i++) {
            head.next = new ListNode(nums[i]);
            head = head.next;
        }
        io.smartir.leetcode.Utils.ListNode.display(curr);
        System.out.println();
        int k = 4;
        //when
        var result = underTest.reverseKGroup(curr, k);
        //then
        io.smartir.leetcode.Utils.ListNode.display(result);
    }
}