package io.smartir.leetcode.DSA.medium;

import java.util.HashMap;
import java.util.Map;

public class LeetCode173 {
    Map<Integer, Integer> values = new HashMap<>();
    int counter = 0;
    public LeetCode173(TreeNode root) {
        fillMap(root);
        counter = 1;
        System.out.println(values);
    }

    public int next() {
        if (hasNext()) {
            return values.get(++counter);
        }
        return -1;
    }

    public boolean hasNext() {
        return values.containsValue(counter);
    }

    private void fillMap(TreeNode root) {
        if (root == null) {
            return;
        }
        fillMap(root.left);
        values.put(counter++, root.val);
        fillMap(root.right);
    }
}
