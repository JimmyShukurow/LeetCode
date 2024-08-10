package io.smartir.leetcode.DSA.medium;

import java.util.*;

public class LeetCode15 {
    public List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, Integer> currMap = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                if (currMap.containsValue(-1 * nums[i] - nums[j])) {
                    var list = List.of(nums[i], nums[j], -1 * nums[i] - nums[j]);
                    if (!checkList(result, list)) result.add(list);
                }
                currMap.put(j, nums[j]);
            }
            currMap.clear();
        }
        return result;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int target = -nums[i];
            int left = i + 1;
            int right = length - 1;
            while (left < right) {
                if (nums[left] + nums[right] == target) {
                    result.add(List.of(nums[left], nums[right], nums[i]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                }
                else if (nums[left] + nums[right] < target) left++;
                else right--;
            }
        }
        return result;
    }


    public boolean checkList(List<List<Integer>> given, List<Integer> target) {
        var sortedTarget = target.stream().sorted().toList();
        for (List<Integer> list : given) {
            var sortedList = list.stream().sorted().toList();
            if (sortedList.equals(sortedTarget)) return true;
        }
        return false;
    }
}

//[-4,0,4],[-4,1,3],[-3,-1,4],[-3,0,3],[-3,1,2],[-2,-1,3],[-2,0,2],[-1,-1,2],[-1,0,1]]
