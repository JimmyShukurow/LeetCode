package io.smartir.leetcode.DSA.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class LeetCode289 {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        Map<List<Integer>, Integer> datas = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int neighbourCounter = 0;
                if (i > 0 && j > 0 && board[i - 1][j - 1] == 1) neighbourCounter++;
                if (i > 0 && board[i - 1][j] == 1) neighbourCounter++;
                if (i > 0 && j < n-1 && board[i - 1][j + 1] == 1) neighbourCounter++;
                if (j > 0 && board[i][j - 1] == 1) neighbourCounter++;
                if (j < n-1 && board[i][j + 1] == 1) neighbourCounter++;
                if (i < m-1 && j > 0 && board[i + 1][j - 1] == 1) neighbourCounter++;
                if (i < m-1 && board[i + 1][j] == 1) neighbourCounter++;
                if (i < m-1 && j < n-1 && board[i + 1][j + 1] == 1) neighbourCounter++;
//                System.out.println(i+","+j+" =>" + neighbourCounter);
                datas.put(List.of(i, j), neighbourCounter);
            }
        }

        for (List<Integer> key : datas.keySet()) {
            if (datas.get(key) < 2) board[key.get(0)][key.get(1)] = 0;
            if (datas.get(key) > 3) board[key.get(0)][key.get(1)] = 0;
            if (datas.get(key)==3) board[key.get(0)][key.get(1)] = 1;
        }
//        System.out.println(datas);
        Arrays.stream(board).forEach(arr->{
            System.out.println(Arrays.toString(arr));
        });
    }
}
