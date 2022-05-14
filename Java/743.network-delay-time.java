/*
 * @lc app=leetcode id=743 lang=java
 *
 * [743] Network Delay Time
 */

// @lc code=start
class Solution {
    int cnt;
    Map<Integer, List<int[]>> map;
    int[] nodes;
    public int networkDelayTime(int[][] times, int n, int k) {
        cnt = 0;
        nodes = new int[n+1];
        map = new HashMap<>();
        Arrays.fill(nodes, -1);
        Arrays.sort(times, (a,b) -> {return a[2]-b[2];});
        for(int i=0; i<times.length; ++i){
            List<int[]> link = map.getOrDefault(times[i][0], new ArrayList<>());
            link.add(times[i]);
            map.put(times[i][0], link);
        }
        dfs(k, 0);
        int max = 0;
        if(cnt != n) return -1;
        for(int i=1; i<nodes.length; ++i){
            max = Math.max(max, nodes[i]);
        }
        return max;
    }
    public void dfs(int cur, int time){
        if(nodes[cur] == -1) cnt++;
        nodes[cur] = time;
        List<int[]> links = map.get(cur);
        if(links == null || links.size() == 0) return;
        for(int[] link: links){
            int nextime = time+link[2];
            if(nodes[link[1]] != -1 && nodes[link[1]] <= nextime) continue;
            dfs(link[1], nextime);
        }
    }
}
// @lc code=end

