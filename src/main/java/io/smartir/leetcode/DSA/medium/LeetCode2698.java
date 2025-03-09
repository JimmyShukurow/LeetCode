package io.smartir.leetcode.DSA.medium;

public class LeetCode2698 {
    int result = 0;

    public int punishmentNumber(int n) {
        for (int i = 0; i <= n; i++) {
            int square = i * i;
            if (checkNum(square, i)) {
                result += (square);
            }
        }
        return result;
    }

    public boolean checkNum(int square, int target) {
        if (square == 0 || target < 0 || square < target) return false;
        if (square == target) return true;
       return checkNum(square / 10, target - (square % 10))
               || checkNum(square /100, target - (square % 100))
               || checkNum(square /1000, target - (square % 1000));
    }
}
