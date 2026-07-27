package io.smartir.leetcode.DSA.medium;

import java.util.List;

public class LeetCode339 {
    public int depthSum(List<?> list) {
        return depthSumHelper(list, 1);
    }

    private int depthSumHelper(List<?> list, int depth) {
        int sum = 0;
        for (Object obj : list) {
            if (obj instanceof List) {
                sum += depthSumHelper((List<?>) obj, depth + 1);
            } else {
                sum += (Integer) obj * depth;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        LeetCode339 test = new LeetCode339();
        List<Object> nestedList = List.of(1, List.of(4, List.of(6)));
        System.out.println(test.depthSum(nestedList)); // Output: 27
    }
}
