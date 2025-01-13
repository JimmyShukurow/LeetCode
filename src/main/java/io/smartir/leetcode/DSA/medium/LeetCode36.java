package io.smartir.leetcode.DSA.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class LeetCode36 {
    List<Integer> nums = new ArrayList<>();
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                char num = board[i][j];
                if (Character.isDigit(num)){
                    if (nums.contains(num-'0')) return false;
                    nums.add(num-'0');
                }
            }
            nums.clear();
        }
        nums.clear();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                int num = board[j][i];
                if (Character.isDigit(num)){
                    if (nums.contains(num-'0')) return false;
                    nums.add(num-'0');
                }
            }
            nums.clear();
        }
        nums.clear();
        int m = 0, k = 0;
        while (true){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int num = board[m+i][k+j];
                    if (Character.isDigit(num)){
                        if (nums.contains(num-'0')) return false;
                        nums.add(num-'0');
                    }
                }
            }
            nums.clear();
            k += 3;
            if (k> board.length-3){
                m += 3;
                k = 0;
            }
            if (m> board.length-3) break;
        }
        return true;
    }
}
