package io.smartir.leetcode.DSA.medium;

import java.util.ArrayList;
import java.util.List;

public class LeetCode155 {
    int minValue = Integer.MAX_VALUE;
    List<Integer> values = new ArrayList<>();

    public LeetCode155() {
    }

    public void push(int val) {
        values.add(val);
        minValue = Math.min(minValue, val);
    }

    public void pop() {
        values.remove(values.size() - 1);
        if(values.isEmpty()){
            minValue = Integer.MAX_VALUE;
        }else {
            minValue = values.stream().min(Integer::compareTo).get();
        }
    }

    public int top() {
        return values.get(values.size() - 1);
    }

    public int getMin() {
        return minValue;
    }
}
