package io.smartir.leetcode.DSA.easy;

import java.util.ArrayList;
import java.util.List;

public class LeetCode118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            if (i == 0) {
                result.add(row);
                continue;
            };
            if (result.size() > 1) {
                List<Integer> previous =  result.get(result.size()-1);
                for (int j = 0; j < previous.size()-1; j++) {
                    row.add(previous.get(j) + previous.get(j + 1));
                }
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}
