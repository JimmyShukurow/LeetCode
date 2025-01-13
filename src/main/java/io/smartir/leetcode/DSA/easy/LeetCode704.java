package io.smartir.leetcode.DSA.easy;

public class LeetCode704 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        if(nums.length ==1 && nums[0] != target) return -1;
        else if(nums[0] == target) return 0;
        while(left < right){
            if(left+1 == right && nums[left] != target && nums[right-1] != target) return -1;
            int mid = (left+right)/2;
            if(nums[mid] < target) left = mid;
            if(nums[mid] > target) right = mid;
            if(nums[mid] == target) return mid;
        }
        return -1;
    }
}
