/*
 * @lc app=leetcode id=785 lang=java
 *
 * [785] Is Graph Bipartite?
 */

// @lc code=start
class Solution {
    int[] color;
    boolean res;
    public boolean isBipartite(int[][] graph) {
        color = new int[graph.length];
        res = true;
        for(int i=0; i<graph.length; ++i){
            dfs(graph, i);
        }
        return res;
    }
    public void dfs(int[][] graph, int cur){
        if(!res) return;
        if(color[cur] == 0){
            color[cur] = 1;
        }
        int[] edge = graph[cur];
        int paint = color[cur]==1? 2:1;
        for(int i=0; i<edge.length; ++i){
            if(color[edge[i]] == 0){
                color[edge[i]] = paint;
                dfs(graph, edge[i]);
            }else if(color[edge[i]] != paint){
                res = false;
            }
        }
    }
}
// @lc code=end

