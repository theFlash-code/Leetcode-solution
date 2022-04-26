/*
 * @lc app=leetcode id=1584 lang=java
 *
 * [1584] Min Cost to Connect All Points
 */

// @lc code=start
class Solution {
    public int minCostConnectPoints(int[][] points) {
        int[] color = new int[points.length];
        PriorityQueue<edge> pq = new PriorityQueue<>((a,b) -> {return a.weight-b.weight;});
        for(int i=0; i<points.length; ++i){
            color[i] = i;
            for(int j=i+1; j<points.length; ++j){
                int weight = Math.abs(points[i][0]-points[j][0])+Math.abs(points[i][1]-points[j][1]);
                edge e = new edge(i, j, weight);
                pq.add(e);
            }
        }
        int cost = 0, cnt = 0;
        while(cnt<color.length-1){
            edge e = pq.poll();
            int p1 = e.p1, p2 = e.p2;
            if(color[p1] == color[p2]) continue;
            int change = color[p2];
            for(int i=0; i<color.length; ++i){
                if(color[i] == change) color[i] = color[p1];
            }
            cost += e.weight;
            cnt++;
        }
        
        return cost;
    }
    class edge{
        int p1;
        int p2;
        int weight;
        
        edge(int p1, int p2, int w){
            this.p1 = p1;
            this.p2 = p2;
            weight = w;
        }
    }
}
// @lc code=end

