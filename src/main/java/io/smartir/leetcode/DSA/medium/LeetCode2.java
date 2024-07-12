package io.smartir.leetcode.DSA.medium;

import java.math.BigInteger;

public class LeetCode2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        BigInteger num1 = BigInteger.valueOf(0);
        BigInteger num2 = BigInteger.valueOf(0);
        BigInteger digits = BigInteger.ONE;
        while (l1 != null) {
            num1 =  num1.add(digits.multiply(BigInteger.valueOf(l1.val)));
            digits = digits.multiply(BigInteger.valueOf(10));
            l1 = l1.next;
        }
        digits = BigInteger.ONE;
        while (l2 != null) {
            num2 =  num2.add(digits.multiply(BigInteger.valueOf(l2.val)));
            digits = digits.multiply(BigInteger.valueOf(10));
            l2 = l2.next;
        }
        BigInteger sum = num1.add(num2);
        ListNode temp = result;
        while (!sum.equals(BigInteger.valueOf(0))) {
            temp.val = Integer.parseInt(String.valueOf(sum.mod(BigInteger.valueOf(10))));
            sum = sum.divide(BigInteger.valueOf(10));
            if (!sum.equals(BigInteger.valueOf(0))) temp.next = new ListNode();
            temp = temp.next;
        }
        return result;
    }
}
