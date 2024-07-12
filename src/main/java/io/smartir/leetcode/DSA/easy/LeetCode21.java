package io.smartir.leetcode.DSA.easy;

public class LeetCode21 {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode result = new ListNode();
        ListNode theHeadOfResult = result;
        while (true) {
            if (list1 == null || list2 == null) break;
            if (list1.val < list2.val) {
                result.next = list1;
                result = result.next;
                list1 = list1.next;
            } else {
                result.next = list2;
                result = result.next;
                list2 = list2.next;
            }
        }

        while (list1 != null) {
            result.next = list1;
            list1 = list1.next;
            result = result.next;

        }
        while (list2 != null) {
            result.next = list2;
            list2 = list2.next;
            result = result.next;

        }
        return theHeadOfResult.next;
    }
}
