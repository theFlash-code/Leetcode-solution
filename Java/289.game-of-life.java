/*
 * @lc app=leetcode id=289 lang=java
 *
 * [289] Game of Life
 */

// @lc code=start
class Solution {
    int[][] directions = { { 1, 0 }, { 1, 1 }, { 0, 1 }, { -1, 1 }, { -1, 0 }, { -1, -1 }, { 0, -1 }, { 1, -1 } };

    public void gameOfLife(int[][] board) {
        int[][] nbr = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] == 1) {
                    for (int[] dir : directions) {
                        int y = i + dir[0];
                        int x = j + dir[1];
                        if (y >= board.length || x >= board[0].length || x < 0 || y < 0)
                            continue;
                        nbr[y][x]++;
                    }
                }
            }
        }
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] == 1) {
                    if (nbr[i][j] < 2 || nbr[i][j] > 3) {
                        board[i][j] = 0;
                    }
                } else {
                    if (nbr[i][j] == 3) {
                        board[i][j] = 1;
                    }
                }
            }
        }
    }
}
// @lc code=end
