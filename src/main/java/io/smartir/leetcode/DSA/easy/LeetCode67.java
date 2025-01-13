package io.smartir.leetcode.DSA.easy;

public class LeetCode67 {

    public String addBinary(String a, String b) {
        int carry = 0;
        int firstLength = a.length()-1;
        int secondLength = b.length()-1;
        StringBuilder result = new StringBuilder();
        while (firstLength >= 0 && secondLength >= 0) {
            var curr = (a.charAt(firstLength) - '0') + (b.charAt(secondLength) - '0') + carry;
            if(curr ==0) {
                result.insert(0, '0');
            }
            if (curr==1) {
                result.insert(0, '1');
                carry = 0;
            }
            if (curr==2) {
                result.insert(0, '0');
                carry = 1;
            }
            if (curr==3) {
                result.insert(0, '1');
                carry = 1;
            }
            firstLength--;
            secondLength--;
        }

        while (firstLength >= 0 ) {
            var curr = (a.charAt(firstLength) - '0')  + carry;
            if(curr ==0) {
                result.insert(0, '0');
            }
            if (curr==1) {
                result.insert(0, '1');
                carry = 0;
            }
            if (curr==2) {
                result.insert(0, '0');
                carry = 1;
            }
            if (curr==3) {
                result.insert(0, '1');
                carry = 1;
            }
            firstLength--;
        }

        while (secondLength >= 0 ) {
            var curr = (b.charAt(secondLength) - '0')  + carry;
            if(curr ==0) {
                result.insert(0, '0');
            }
            if (curr==1) {
                result.insert(0, '1');
                carry = 0;
            }
            if (curr==2) {
                result.insert(0, '0');
                carry = 1;
            }
            if (curr==3) {
                result.insert(0, '1');
                carry = 1;
            }
            secondLength--;
        }
        if (carry ==1) result.insert(0, '1');

        return result.toString();
    }
}
