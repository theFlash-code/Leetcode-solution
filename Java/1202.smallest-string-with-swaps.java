/*
 * @lc app=leetcode id=1202 lang=java
 *
 * [1202] Smallest String With Swaps
 */

// @lc code=start
class Solution {
    int[] color;

    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {

        color = new int[s.length()];
        for (int i = 0; i < color.length; ++i) {
            color[i] = i;
        }

        for (List<Integer> p : pairs) {
            union(p.get(0), p.get(1));
        }

        Map<Integer, PriorityQueue<Character>> map = new HashMap<>();
        for (int i = 0; i < color.length; ++i) {
            int root = find(i);
            map.putIfAbsent(root, new PriorityQueue<Character>());
            map.get(root).add(s.charAt(i));
        }
        char[] res = new char[s.length()];
        for (int i = 0; i < res.length; ++i) {
            res[i] = map.get(find(i)).poll();
        }
        return String.valueOf(res);
    }

    private void union(int a, int b) {
        int pa = find(a), pb = find(b);
        if (pa < pb) {
            color[pb] = pa;
        } else {
            color[pa] = pb;
        }
    }

    private int find(int v) {
        int root = v;
        while (root != color[root]) {
            root = color[root];
        }
        while (v != root) {
            color[v] = root;
            v = color[v];
        }
        return root;
    }
}
// @lc code=end
