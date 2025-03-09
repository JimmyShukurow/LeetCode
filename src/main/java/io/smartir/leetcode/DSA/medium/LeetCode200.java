package io.smartir.leetcode.DSA.medium;

public class LeetCode200 {
    int counter = 0;

    public int numIslands(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    counter++;
                    markIsland(grid, i, j);
                }
            }
        }
        return counter;
    }

    public void markIsland(char[][] grid, int row, int col) {
        grid[row][col] = '0';
        if (
                !up(grid, row, col) &&
                        !down(grid, row, col) &&
                        !left(grid, row, col) &&
                        !right(grid, row, col)
        ) return;
        if (up(grid, row, col)) markIsland(grid, row - 1, col);
        if (down(grid, row, col)) markIsland(grid, row + 1, col);
        if (left(grid, row, col)) markIsland(grid, row, col - 1);
        if (right(grid, row, col)) markIsland(grid, row, col + 1);

    }

    private boolean up(char[][] grid, int row, int col) {
        if (row > 0) return grid[row - 1][col] == '1';
        return false;
    }

    private boolean down(char[][] grid, int row, int col) {
        if (row < grid.length - 1) return grid[row + 1][col] == '1';
        return false;
    }

    private boolean left(char[][] grid, int row, int col) {
        if (col > 0) return grid[row][col - 1] == '1';
        return false;
    }

    private boolean right(char[][] grid, int row, int col) {
        if (col < grid[0].length - 1) return grid[row][col + 1] == '1';
        return false;
    }

    public void displayArray(char[][] grid) {
        System.out.println("Counter is=> " + counter);
        for (char[] chars : grid) {
            for (char c : chars) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
    }

    //Solution from internet Start HERE
    public int numIslandsOtherSolution(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int numIslands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    numIslands++;
                    dfs(grid, i, j);
                }
            }
        }

        return numIslands;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1') {
            return;
        }

        grid[i][j] = '0'; // mark as visited
        dfs(grid, i + 1, j); // down
        dfs(grid, i - 1, j); // up
        dfs(grid, i, j + 1); // right
        dfs(grid, i, j - 1); // left
    }
    //Solution from internet End HERE
}
