package io.smartir.leetcode.DSA.easy;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        ListNode temp = this;
        while (temp.next != null) {
            result.append("ListNode: " + " val: ").append(val);
            temp = temp.next;
        }
        return result.toString();
    }
}
