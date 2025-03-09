package io.smartir.leetcode.DSA.easy;

import java.util.ArrayList;
import java.util.List;

public class LeetCode2570 {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> result = new ArrayList<>();
        int first = 0;
        int second = 0;
        while (first < nums1.length && second < nums2.length) {
            if (nums1[first][0] < nums2[second][0]) {
                result.add(nums1[first]);
                first++;
            } else if (nums1[first][0] > nums2[second][0]) {
                result.add(nums2[second]);
                second++;
            }else {
                result.add(new int[]{nums1[first][0], nums1[first][1]+ nums2[second][1]});
                first++;
                second++;
            }
        }
        while (first < nums1.length) {
            result.add(nums1[first]);
            first++;
        }
        while (second < nums2.length) {
            result.add(nums2[second]);
            second++;
        }

        return result.toArray(new int[result.size()][]);
    }
}
