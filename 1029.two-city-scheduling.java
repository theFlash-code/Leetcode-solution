/*
 * @lc app=leetcode id=1029 lang=java
 *
 * [1029] Two City Scheduling
 */

// @lc code=start
class Solution {
    public int twoCitySchedCost(int[][] costs) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            return a - b;
        });
        int cost = 0;
        for (int i = 0; i < costs.length; ++i) {
            cost += costs[i][0];
            pq.add(costs[i][1] - costs[i][0]);
        }
        int n = costs.length / 2;
        for (int i = 0; i < n; ++i) {
            cost += pq.poll();
        }
        return cost;
    }
}
// @lc code=end
