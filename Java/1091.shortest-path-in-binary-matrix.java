/*
 * @lc app=leetcode id=1091 lang=java
 *
 * [1091] Shortest Path in Binary Matrix
 */

// @lc code=start
class Solution {
    int[][] direction = new int[][] { { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 }, { 0, -1 }, { -1, -1 }, { -1, 0 },
            { -1, 1 } };

    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        if (grid[0][0] == 0)
            q.offer(new int[] { 0, 0, 1 });
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            if (cur[0] == grid.length - 1 && cur[1] == grid[0].length - 1)
                return cur[2];
            // System.out.println(cur[0]+" "+cur[1]);
            for (int[] dir : direction) {
                int x = cur[0] + dir[0], y = cur[1] + dir[1], depth = cur[2];
                if (x < 0 || x >= grid.length || y < 0 || y >= grid.length || grid[x][y] == 1)
                    continue;
                q.offer(new int[] { x, y, depth + 1 });
                grid[x][y] = 1;
            }
        }
        return -1;
    }
}

// @lc code=end
