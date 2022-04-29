/*
 * @lc app=leetcode id=1631 lang=java
 *
 * [1631] Path With Minimum Effort
 */

// @lc code=start
class Solution {
    int[] parent;

    public int minimumEffortPath(int[][] heights) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            return a[2] - b[2];
        });
        int len = heights[0].length;
        parent = new int[heights.length * heights[0].length];
        for (int i = 0; i < parent.length; ++i) {
            parent[i] = i;
        }

        for (int i = 0; i < heights.length; ++i) {
            for (int j = 0; j < len; ++j) {
                int p1 = i * len + j;
                if (j + 1 < len) {
                    int w = Math.abs(heights[i][j + 1] - heights[i][j]);
                    int[] edge = new int[] { p1, p1 + 1, w };
                    pq.add(edge);
                }
                if (i + 1 < heights.length) {
                    int w = Math.abs(heights[i + 1][j] - heights[i][j]);
                    int[] edge = new int[] { p1, p1 + len, w };
                    pq.add(edge);
                }
            }
        }
        while (pq.size() > 0) {
            int[] edge = pq.poll();
            union(edge[0], edge[1]);
            if (find(parent[0]) == find(parent[parent.length - 1])) {
                return edge[2];
            }
        }

        return 0;
    }

    public int find(int i) {
        int root = i;
        while (parent[root] != root) {
            root = parent[root];
        }
        while (parent[i] != i) {
            i = parent[i];
            parent[i] = root;
        }
        return root;
    }

    public void union(int a, int b) {
        int pa = find(a), pb = find(b);
        if (pa < pb) {
            parent[pb] = pa;
        } else {
            parent[pa] = pb;
        }
    }
}
// @lc code=end
